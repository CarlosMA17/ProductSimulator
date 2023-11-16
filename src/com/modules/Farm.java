package com.modules;
import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Vegetable> warehouse = new ArrayList<>();
    private int maxCapacity;


    public Farm(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


    public synchronized void plantVegetable(String farmerName, String vegetableName) {
        while (warehouse.size() >= maxCapacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Vegetable vegetable = new Vegetable(vegetableName, farmerName);

        warehouse.add(vegetable);

        System.out.println("el huerto tiene " + warehouse.size() + " cosas plantadas");
        notify(); //
    }

    public synchronized Vegetable harvestVegetable(String consumerName) {
        while (warehouse.isEmpty()) {
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Vegetable vegetable = warehouse.remove(0);

        notify();

        return vegetable;
    }
}
