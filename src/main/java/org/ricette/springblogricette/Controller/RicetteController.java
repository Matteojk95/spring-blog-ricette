package org.ricette.springblogricette.Controller;

import jakarta.validation.Valid;
import org.ricette.springblogricette.Model.Ricette;
import org.ricette.springblogricette.Repository.RicetteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ricette")
public class RicetteController {

    @Autowired
    private RicetteRepository ricetteRepository;

    @GetMapping
    public String index(Model model) {
        List<Ricette> ricetteList = ricetteRepository.findAll();
        model.addAttribute("ricetteList", ricetteList);
        return "ricette/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("ricetta", new Ricette());
        return "ricette/form";
    }

    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("ricetta") Ricette formRicette, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "ricette/form";
        }
        formRicette.setTitolo(formRicette.getTitolo().toUpperCase());
        ricetteRepository.save(formRicette);
        return "redirect:/ricette";
    }


}