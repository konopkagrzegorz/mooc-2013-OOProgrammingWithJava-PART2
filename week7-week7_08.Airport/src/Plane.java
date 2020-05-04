/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Plane {
    
    private String planeID;
    private int planeCapasity;

    
    public Plane(String planeID, int planeCapasity) {
        this.planeID = planeID;
        this.planeCapasity = planeCapasity;
    }

    public String getPlaneID() {
        return planeID;
    }

    public int getPlaneCapasity() {
        return planeCapasity;
    }

    @Override
    public String toString() {
        return getPlaneID() + " (" + getPlaneCapasity() + " ppl)";
    }

}
