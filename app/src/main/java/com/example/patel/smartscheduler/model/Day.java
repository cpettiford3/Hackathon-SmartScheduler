package com.example.patel.smartscheduler.model;

/**
 * Created by maya v on 3/2/2018.
 */

public enum Day {
    SUNDAY ('N', 0),
    MONDAY ('M', 1),
    TUESDAY ('T', 2),
    WEDNESDAY ('W', 3),
    THURSDAY ('R', 4),
    FRIDAY ('F', 6),
    SATURDAY ('S', 7);

    private char abbr;
    private int id;

    Day (char abbr, int id) {
        this.abbr = abbr;
        this.id = id;
    }

    public char getAbbr() {
        return abbr;
    }

    public void setAbbr(char abbr) {
        this.abbr = abbr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
