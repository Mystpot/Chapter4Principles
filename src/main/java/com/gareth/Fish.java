package com.gareth;

// This is bad ISP

public class Fish implements Animal {

    private int weight;
    private String species;

    Fish()
    {

    }

    Fish(int weight, String species)
    {
        this.weight = weight;
        this.species = species;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getSpecies()
    {
        return species;
    }

    public String swim()
    {
        String swimming = "I am swimming!";

        return swimming;
    }

    public String walk()
    {
        return null;
    }
}
