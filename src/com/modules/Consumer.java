package com.modules;

public class Consumer implements Runnable {
    private String name;
    private int vegetablesToConsume;
    private Farm farm;

    public Consumer(String name, int vegetablesToConsume, Farm farm) {
        this.name = name;
        this.vegetablesToConsume = vegetablesToConsume;
        this.farm = farm;
    }


    @Override
    public void run() {

        for (int i = 0; i < vegetablesToConsume; i++) {
            farm.harvestVegetable(name);

            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
