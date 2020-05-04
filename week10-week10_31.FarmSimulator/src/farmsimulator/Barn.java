/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Grzegorz Konopka
 */
public class Barn {
    
    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.tank = tank;
        this.robot = null;
    }

    public BulkTank getBulkTank() {
        return tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = milkingRobot;
        this.robot.setBulkTank(tank);
    }
    
    public void takeCareOf(Cow cow) {
         try {
            this.robot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }
    
    public void takeCareOf(Collection<Cow> cows) {
          for (Cow c : cows) {
            takeCareOf(c);
        }
    }

    @Override
    public String toString() {
        return Math.ceil(this.tank.getVolume()) + "/"
                + Math.ceil(this.tank.getCapacity());
    }
}
