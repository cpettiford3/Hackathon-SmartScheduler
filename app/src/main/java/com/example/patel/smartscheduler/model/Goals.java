package com.example.patel.smartscheduler.model;

/**
 * Created by Patel on 3/3/2018.
 */

public enum Goals {
    HEALTHY_EATING("Healthy Eating"),
    WEIGHT_LOSS("Weight Loss"),
    MUSCLE_GAIN("Muscle Gain");

    private String type;

    Goals(String string) {
        type = string;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Goals{}";
    }
}
