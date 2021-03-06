/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Grzegorz Konopka
 */
public class Thermometer implements Sensor {

    private Random random;
    private boolean status;

    public Thermometer() {
        this.random = new Random();
        this.status = false;
    }
    
    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void on() {
        if (status == false) {
            this.status = true;
        }
    }

    @Override
    public void off() {
        if (status == true) {
            this.status = false;
        }
    }

    @Override
    public int measure() {
       if (isOn() == true) {
           int randomNum = random.nextInt(30 - (-30) + 1) - 30;
           return randomNum;
       }
       throw new IllegalStateException();
    }
    
    
}
