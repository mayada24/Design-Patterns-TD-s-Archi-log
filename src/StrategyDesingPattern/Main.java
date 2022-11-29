package StrategyDesingPattern;

public class Main {
    public static void main(String[] args) {
        //Create object of item class
        Shopping shopping = new Shopping();
        Item item1 = new Item("Bread", "xYt985",10);
        Item item2 = new Item("Milk", "UxPj87", 20);
        // add items in our list
        shopping.addItem(item1);
        shopping.addItem(item2);
        //pay by credit card
        shopping.pay(new CreditCardStrategy("Mohammed", "1293950562022", "20/03/2026"));
        shopping.pay(new PayseraStrategy("amel@gmail.com", "herpassword"));
    }
}