package com.example;

import java.util.List;

public class Lion extends Feline{

    boolean hasMane;
    Predator predator;

    public Lion(String sex, Feline feline) throws Exception {
        this.predator = feline;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    @Override
    public int getKittens() {
        return super.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
