package com.gareth;

// This is good LSP

public class Frog implements SeaAnimal, LandAnimal

{
    private String species;
    private int weight;

    Frog()
    {

    }

    Frog(String species, int weight){

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

    public String walk()
    {
        String walking = "I can walk!";
        return walking;
    }

    public String swim()
    {
        String swimming = "I can also swim!";
        return swimming;
    }

}

