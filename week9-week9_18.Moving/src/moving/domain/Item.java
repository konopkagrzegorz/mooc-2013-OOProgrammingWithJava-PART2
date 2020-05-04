/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Grzegorz Konopka
 */
public class Item implements Thing,Comparable<Item> {
    
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return name + " (" + getVolume() + " dm^3)";
    }

    @Override
    public int compareTo(Item o) {
        return getVolume() - o.getVolume();
    }
    
    
    
    
    
    
}
