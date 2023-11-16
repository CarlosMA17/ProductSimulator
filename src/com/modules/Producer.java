package com.modules;

public class Producer {
    private String name;
    private int vegetablesToPlant;
    private Farm farm;
    private String[] vegetableTypes = {"lettuce", "cabbage", "onion", "spinach", "potato", "celery", "asparagus",
            "radish", "broccoli", "artichoke", "tomato", "cucumber", "eggplant", "carrot", "green bean"};

    public Producer(String name, int vegetablesToPlant, Farm farm) {
        this.name = name;
        this.vegetablesToPlant = vegetablesToPlant;
        this.farm = farm;
    }

    public void run() {


        for (int i = 0; i < vegetablesToPlant; i++) {
            String vegetableName = vegetableTypes[(int) (Math.random() * vegetableTypes.length)];
            farm.plantVegetable(name, vegetableName);

            try {
                Thread.sleep((int) (Math.random() * 10) + 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
