package org.ricette.springblogricette.Controller;

import jakarta.persistence.*;

@Entity
@Table(name = "ricette")

public class Ricette {

    //ATTRIBUTI
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 255, nullable = false, unique = true)
    private String titolo;
    private String ingredienti;
    private int time;
    private int porzioni;
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

    public void setIngredients(String ingredienti) {
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
