package com.vdmclcv;

import java.util.ArrayList;

public class Hamburger {
    private ArrayList<String> addedSupplements = new ArrayList<>();
    private final String name;
    private final String rollType;
    private final String meat;
    private final double price;
    private double supplementPrice = 0;
    private final Supplement tomato = new Supplement("tomato", 3.22);
    private final Supplement cheese = new Supplement("cheese", 1.23);
    private final Supplement lettuce = new Supplement("lettuce", 0.63);
    private final Supplement onion = new Supplement("onion", 0.23);

    public Hamburger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public void addSupplement(Supplement supplement) {
        if (supplement.getTotalAdded() < 4) {
            supplement.addItem();
            this.supplementPrice += supplement.getPrice();
            addedSupplements.add(supplement.getName() + " - $" + String.format("%.2f",
                    supplement.getPrice()));
        } else {
            System.out.println("Unable to add more supplements.");
        }
    }

    public Supplement getTomato() {
        return tomato;
    }

    public Supplement getCheese() {
        return cheese;
    }

    public Supplement getLettuce() {
        return lettuce;
    }

    public Supplement getOnion() {
        return onion;
    }

    private double getTotalPrice() {
        return this.price + this.supplementPrice;
    }

    public void printSummary() {
        System.out.println(name + " - base price - $" + price + "\n");
        System.out.println("----------");
        System.out.println("Supplements:");
        for (String supplement: addedSupplements) {
            System.out.println(supplement);
        }
        System.out.println("----------");
        System.out.println("Grand Total: $" + String.format("%.2f", getTotalPrice()));
    }
}
