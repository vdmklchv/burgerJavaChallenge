package com.vdmclcv;

public class Supplement {
    private static int totalAdded = 0;
    private int added = 0;
    private final String name;
    private final double cost;

    public Supplement(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public void addItem() {
        added++;
        totalAdded++;
        System.out.println("Supplement " + name + " has been added.");
    }

    public String getName() {
        return name;
    }

    public int getTotalAdded() {
        return totalAdded;
    }

    public double getPrice() {
        return this.cost;
    }

    public int getAdded() {
        return added;
    }
}
