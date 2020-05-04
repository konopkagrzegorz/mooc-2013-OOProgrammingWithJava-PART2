/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Grzegorz Konopka
 */


public class Cow implements Milkable, Alive {
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    private String name;
    private double udderCapacity;
    private double milkAmount;

    public Cow() {
        this.name = NAMES[new Random().nextInt(NAMES.length)];
        this.udderCapacity = 15 + new Random().nextInt(26);
    }

    public Cow(String name) {
        this.name = name;
        this.udderCapacity = 15 + new Random().nextInt(26);
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udderCapacity;
    }
    
    public double getAmount() {
        return milkAmount;
    }

    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.milkAmount) + "/" + Math.ceil(this.udderCapacity);
    }

    @Override
    public double milk() {
        double milkTaken = this.milkAmount;
        this.milkAmount = 0;
        return milkTaken;
    }

    @Override
    public void liveHour() {
        this.milkAmount += (7 + new Random().nextInt(20 - 7 + 1)) / 10.0;
        if (this.milkAmount > this.udderCapacity) {
            this.milkAmount = this.udderCapacity;
        }
    }
    
    

}
