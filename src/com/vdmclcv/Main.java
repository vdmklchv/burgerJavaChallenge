package com.vdmclcv;

public class Main {

    public static void main(String[] args) {
        Hamburger superHamburger = new Hamburger("Great Burger", "ciabatta", "veal", 12.99);
        Supplement lettuce = superHamburger.getLettuce();
        Supplement tomato = superHamburger.getTomato();
        superHamburger.addSupplement(lettuce);
        superHamburger.addSupplement(tomato);


        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Burger","wheat roll", "chicken", 18.33);
        deluxeBurger.addSupplement(lettuce);

        superHamburger.printSummary();
        deluxeBurger.printSummary();
    }
}
