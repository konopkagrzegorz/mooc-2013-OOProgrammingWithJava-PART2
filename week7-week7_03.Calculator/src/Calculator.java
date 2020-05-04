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
    
    private Reader reader;
    private int count;

    public Calculator() {
        this.reader = new Reader();
        this.count = 0;
    }
    
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                countIncrease();
            } else if (command.equals("difference")) {
                difference();
                countIncrease();
            } else if (command.equals("product")) {
                product();
                countIncrease();
            }
        }
        statistics();
    }
    
    private void sum() {
       System.out.print("value1: ");
       int value1 = reader.readInteger(); // read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = reader.readInteger(); // read the value using the Reader-object
       int sum = value1 + value2; // print the value according to the example above
        System.out.println("sum of the values " + sum);
    }
    
    private void product() {
       System.out.print("value1: ");
       int value1 = reader.readInteger(); // read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = reader.readInteger(); // read the value using the Reader-object
       int product = value1 * value2; // print the value according to the example above
        System.out.println("product of the values " + product);
    }
    
    private void difference() {
       System.out.print("value1: ");
       int value1 = reader.readInteger(); // read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = reader.readInteger(); // read the value using the Reader-object
       int diff = value1 - value2; // print the value according to the example above
        System.out.println("difference of the values " + diff);
    }
    
    private void countIncrease() {
        this.count++;
    }

    public int getCount() {
        return count;
    }

    
    private void statistics() {
        System.out.println("Calculations done: " + getCount());
    }
    
    
    
    
    
    
    
    
    
}
