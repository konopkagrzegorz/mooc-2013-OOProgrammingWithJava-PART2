/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Purchase {
    
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
    
    public int price() {
        int totalPrice = getAmount() * getUnitPrice();
        return totalPrice;
    }
    
    public void increaseAmount() {
        this.amount++;
    }

    @Override
    public String toString() {
        return getProduct() + ": " + getAmount();
    }
}

