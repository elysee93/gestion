/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elysee Amour
 */
public class NewClass {
public int ID = 0;
public String description = "-description required-";
//the color codes are R=Red, B=Blue, G=Green, U=Unset
public char colorCode = 'U';
public double price = 0.0;
public int quantityInStock = 0;
        
        //this method displays the values for an item
        
public void displayShirtInformation() {
            System.out.println("Shirt ID: " + ID);
            System.out.println("shirt description:" + description);
            System.out.println("color code: " + colorCode);
            System.out.println("shirt price: " + price);
            System.out.println("quantity in stock: " + quantityInStock);
            
            
        }
        
        public static void main(String args [] ){
                NewClass myshirt;
                myshirt = new NewClass(); // Creation d'instance
                myshirt.displayShirtInformation();

            }
        
}
