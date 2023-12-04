package com.example.codingtest.test.programmingTest1;

import java.util.Map;

abstract class Bread {
    protected String breadType;
    protected Map<String, Integer> recipe;

    public Bread(String breadType, Map<String, Integer> recipe) {
        this.breadType = breadType;
        this.recipe = recipe;
    }

    public void print() {
        System.out.println("breadType: " + breadType);
        System.out.println("recipe");
        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
}

class CreamBread extends Bread {
    public CreamBread(Map<String, Integer> recipe) {
        super("cream", recipe);
    }
}

class SugarBread extends Bread {
    public SugarBread(Map<String, Integer> recipe) {
        super("sugar", recipe);
    }
}

class ButterBread extends Bread {
    public ButterBread(Map<String, Integer> recipe) {
        super("butter", recipe);
    }
}

class BreadFactory {
    public static Bread createBread(String breadType, Map<String, Integer> recipe) {
        switch (breadType) {
            case "cream":
                return new CreamBread(recipe);
            case "sugar":
                return new SugarBread(recipe);
            case "butter":
                return new ButterBread(recipe);
            default:
                throw new IllegalArgumentException("Invalid bread type: " + breadType);
        }
    }
}
