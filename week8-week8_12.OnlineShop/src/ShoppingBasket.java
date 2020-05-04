
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class ShoppingBasket {
    
    private Map<String,Purchase> shoppingBasket;

    public ShoppingBasket() {
        this.shoppingBasket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
        if(this.shoppingBasket.containsKey(product)) {
            this.shoppingBasket.get(product).increaseAmount();
        } else {
            this.shoppingBasket.put(product, new Purchase(product, 1, price));
        }
    }
    
    public int price() {
        int totalPrice = 0;
        for (Purchase product : this.shoppingBasket.values()) {
            totalPrice += product.price();
        }
        return totalPrice;
    }
    
    public void print() {
        for (Purchase product : this.shoppingBasket.values()) {
            System.out.println(product);
        }
    }
}
