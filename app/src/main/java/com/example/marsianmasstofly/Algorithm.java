package com.example.marsianmasstofly;

public class Algorithm {
    private float oilFromMass = (3.721F / 9.80665F) * 100;
    public float calculateOil(String mass) {
        if (mass.contains(",")) {
            mass = mass.replace(",", ".");
        }
        float massFloat = Float.parseFloat(mass);
        return massFloat * oilFromMass;
    }
}
