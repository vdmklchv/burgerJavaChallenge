package com.vdmclcv;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String name, String rollType, String meat, double price) {
        super(name, rollType, meat, price);
        initializeDeluxeBurger();
    }

    private void initializeDeluxeBurger() {
        super.addSupplement(new Supplement("Drink", 2.22));
        super.addSupplement(new Supplement("Chips", 1.31));
    }

    @Override
    public void addSupplement(Supplement supplement) {
        System.out.println("You can't add any supplements to Deluxe burger.");
    }

}
