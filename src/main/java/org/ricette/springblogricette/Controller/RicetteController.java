package org.ricette.springblogricette.Controller;

import ch.qos.logback.core.model.Model;
import org.ricette.springblogricette.Model.Ricette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
        
    }
}
