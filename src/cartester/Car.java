/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author jacra1226
 */
public class Car {
    private String Make, Model, Colour;
    private double Year, Price, Seats;
    
    public Car() {
        Make = "Ford";
        Model = "Truck";
        Colour = "Red";
        Year = 2001;
        Price = 9000;
        Seats = 5;
        
    }
     public Car(String Make2, String Model2, String Colour2, double Year2, double Price2, double Seats2) {
    Make = Make2;
    Model = Model2;
    Colour = Colour2;
    Year = Year2;
    Price = Price2;
    Seats = Seats2;
     }
     public Car(String Make2, String Model2, String Colour2) {
   

    Make = Make2;
    Model = Model2;
    Colour = Colour2;
    Year = (int) (Math.random() * (2018-1980)) + 1980;
    Price = (int) (Math.random() * (10000-1000)) + 1000;
    Seats = (int) (Math.random() * (7-2)) + 2;
      }
      public void honkHorn() {
    System.out.println("Honk!");
  }
      
      
      public String toString() {
    String output = "Make: " + Make+ "\n";
    output += "Model: " + Model + "\n";
    output += "Colour: " + Colour + "\n";
    output += "Year: " + Year + "\n";
    output += "Price: " + Price + "$" + "\n";
    output += "Amount of Seats: " + Seats;
    
    return output;
    
      } 
}
