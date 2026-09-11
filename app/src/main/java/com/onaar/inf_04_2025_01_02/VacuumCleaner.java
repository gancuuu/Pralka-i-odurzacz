package com.onaar.inf_04_2025_01_02;

public class VacuumCleaner extends Device {

    private boolean stan;

    public VacuumCleaner() {
        stan = false;
    }

    public void on() {
        if (!stan) {
            stan = true;
            wyswietlWiadomosc("Odkurzacz włączono");
        }
    }

    public void off() {
        if (stan) {
            stan = false;
            wyswietlWiadomosc("Odkurzacz wyłączono");
        }
    }
}