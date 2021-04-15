/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.backing;

/**
 *
 * @author Kuba
 */
public class Studenci {
    private String imie;
    private String nazwisko;
    private double srednia;

    public Studenci(String imie, String nazwisko, double srednia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.srednia = srednia;             
    }
    
    public String getImie() {
        return imie;
    }

    /**
     * @param imie the imie to set
     */
    public void setImie(String imie) {
        this.imie = imie;
    }

    /**
     * @return the nazwisko
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * @param nazwisko the nazwisko to set
     */
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    /**
     * @return the srednia
     */
    public double getSrednia() {
        return srednia;
    }

    /**
     * @param srednia the srednia to set
     */
    public void setSrednia(double srednia) {
        this.srednia = srednia;
    }
}
