
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Storehouse {
    
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Storehouse() {
        this.productPrice = new HashMap<String, Integer>();
        this.productStock = new HashMap<String, Integer>();
    }
    
    
    
   public void addProduct(String product, int price, int stock) {
        productPrice.put(product, price);
        productStock.put(product, stock);
    }
   
   public int price(String product) {
       if(productPrice.containsKey(product)) {
           return productPrice.get(product);
       }
       return -99;
   }
   
   public int stock(String product) {
       if(productStock.containsKey(product)) {
           return productStock.get(product);
       }
       return 0;
   }
   
   public boolean take(String product) {
       if(stock(product) > 0) {
           this.productStock.put(product, stock(product) - 1);
           return true;
       }
       return false;
   }
   
   public Set<String> products() {
       return this.productPrice.keySet();
    }
}
