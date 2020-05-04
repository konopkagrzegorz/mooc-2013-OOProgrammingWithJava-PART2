/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Calculator {
    
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }
    
    public void pressPlus(int n) {
        this.value += n;
    }
    
    public void pressMinus(int n) {
        this.value -=n;
    }
    
    public void pressZet() {
        this.value = 0;
    } 
}
