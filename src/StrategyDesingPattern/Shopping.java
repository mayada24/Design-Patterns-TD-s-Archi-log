package StrategyDesingPattern;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
//List content items
    public List<Item> items;

    public Shopping(){
        this.items = new ArrayList<>();
    }
    public void addItem (Item item){
        this.items.add(item);
    }

    public void  removeItem(Item item){
        this.items.remove(item);
    }
    public int calculateTotal(){
        int sum = 0;
        for (Item item: items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay (PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
