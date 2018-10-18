/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

import javax.swing.JOptionPane;

/**
 *
 * @author jacra1226
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputCar1 = JOptionPane.showInputDialog("Input a car brand");       
        String inputModel1 = JOptionPane.showInputDialog("Input a car model");        
        String inputColour1 = JOptionPane.showInputDialog("Input a colour");
        String year = JOptionPane.showInputDialog("Input a year");
        String price = JOptionPane.showInputDialog("Input a price");
        String seats = JOptionPane.showInputDialog("Input the amount of seats");
        String inputCar2 = JOptionPane.showInputDialog("Input a car brand");
        String inputModel2 = JOptionPane.showInputDialog("Input a car model");
        String inputColour2 = JOptionPane.showInputDialog("Input a colour");
       double year1 =  Double.parseDouble(year); 
       double price1 =  Double.parseDouble(price); 
       double seats1 =  Double.parseDouble(seats); 
                
        Car car1 = new Car(inputCar1, inputModel1, inputColour1,year1,price1,seats1);
        Car car2 = new Car(inputCar2, inputModel2, inputColour2);
        Car car3 = new Car();
        
        
        System.out.println(car1.toString());
    System.out.println("--------------------------");
     System.out.println(car2.toString());
    System.out.println("--------------------------");

   
    System.out.println(car3);
    System.out.println("--------------------------");
    car1.honkHorn();
    car2.honkHorn();
    car3.honkHorn();
    }
    
}
