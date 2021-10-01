package com.example.ksiazkakucharska;

public class Przepis {
    private String nazwa;
    private int kategoria;
    private String skladniki;
    private int idObrazka;

    public Przepis(String nazwa, int kategoria, String skladniki, int idObrazka) {
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.skladniki = skladniki;
        this.idObrazka = idObrazka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getKategoria() {
        return kategoria;
    }

    public void setKategoria(int kategoria) {
        this.kategoria = kategoria;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(String skladniki) {
        this.skladniki = skladniki;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
