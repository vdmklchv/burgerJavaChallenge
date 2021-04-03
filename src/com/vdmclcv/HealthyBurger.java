package com.vdmclcv;

public class HealthyBurger extends Hamburger {
    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "brown rye bread", meat, price);
    }

    @Override
    public void addSupplement(Supplement supplement) {
        super.addSupplement(supplement);
        if (supplement.getTotalAdded() < 2) {
            supplement.addItem();
        } else {
            System.out.println("Unable to add more supplements.");
        }
    }
}
