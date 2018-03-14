package com.gareth;

// This is good LSP

public class Whale implements SeaAnimal {

    private String species;
    private int weight;

    Whale()
    {}

    Whale(String species, int weight)
    {
        this.species = species;
        this.weight = weight;
    }

    public String getSpecies()
    {
        return species;
    }

    public int getWeight()
    {
        return weight;
    }

    public String swim()
    {
        String swimming = "I can swim!";
        return swimming;
    }
}
