package com.example.patel.smartscheduler.model;

/**
 * Created by maya v on 3/3/2018.
 */

public enum ActLevel {
    SED ('S', "Sedentary"),
    INT ('I', "Intermediate"),
    ATH ('A', "Athlete");

    private char abbr;
    private String name;

    ActLevel (char abbr, String name) {
        this.abbr = abbr;
        this.name = name;
    }

    public char getAbbr() {
        return abbr;
    }

    public void setAbbr(char abbr) {
        this.abbr = abbr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
