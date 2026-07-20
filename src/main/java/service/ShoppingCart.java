package service;

import model.Food;

public class ShoppingCart {

    private final Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double totalPriceWithoutDiscount() {
        double totalPriceWithoutDiscount = 0;

        for (int i = 0; i < products.length; i++) {
            Food item = products[i];

            totalPriceWithoutDiscount =
                    totalPriceWithoutDiscount + item.getAmount() * item.getPrice();
        }

        return totalPriceWithoutDiscount;
    }

    public double totalPriceWithDiscount() {
        double totalPriceWithDiscount = 0;

        for (int i = 0; i < products.length; i++) {
            Food item = products[i];

            double price = item.getAmount() * item.getPrice();
            double discount = price * item.getDiscount() / 100;

            totalPriceWithDiscount = totalPriceWithDiscount + price - discount;
        }

        return totalPriceWithDiscount;
    }

    public double veganProductsPriceWithoutDiscount() {
        double veganPrice = 0;

        for (int i = 0; i < products.length; i++) {
            Food item = products[i];

            if (item.isVegetarian()) {
                veganPrice = veganPrice + item.getAmount() * item.getPrice();
            }
        }

        return veganPrice;
    }
}
