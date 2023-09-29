package org.ricette.springblogricette.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ricette")

public class Ricette {

    //ATTRIBUTI
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Column(length = 255, nullable = false, unique = true)
    private String titolo;
    @NotBlank
    private String ingredienti;
    @NotNull
    private int time;
    @NotNull
    private int porzioni;
    @NotBlank
    private String testoRicetta;


    //GETTER E SETTER
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPorzioni() {
        return porzioni;
    }

    public void setPorzioni(int porzioni) {
        this.porzioni = porzioni;
    }

    public String getTestoRicetta() {
        return testoRicetta;
    }

    public void setTestoRicetta(String testoRicetta) {
        this.testoRicetta = testoRicetta;
    }
}
