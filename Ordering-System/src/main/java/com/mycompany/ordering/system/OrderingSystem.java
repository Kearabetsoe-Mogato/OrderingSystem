/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordering.system;
/**
 *
 * @author Kearabetsoe Mogato
 * I made a simple ordering system that uses JOptionPane on netbeans IDE 16 to get your order and
 * generate a receipt with total price after tax
 */
import javax.swing.JOptionPane;
public class OrderingSystem {
public static void main(String[] args) {
    final int NUMBER_OF_ITEMS = 10;
    int[] ValidValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412};
    double [] Prices = { 10.29, 13.23, 7.50, 4.69, 11.79, 9.19, 13.50, 10.89, 17.26, 36.00};
    String strItems;
    int orderNumber;
    double itemPrice = 0.0;
    double vatcharge = 0.0;
    boolean ValidItem = false;
    double total = 0.0;
    
    JOptionPane.showMessageDialog(null, "Welcome to Kea's product ordering system choose from the products below \n\n 101-bread\n108 - milk\n201-sugar\n213-coffee\n266-butter\n304-carrots\n311-beetroot\n409-cool drink\n411-maize meal\n412-flour");
      strItems = JOptionPane.showInputDialog(null, "enter the item number you want to order/buy");
        orderNumber = Integer.parseInt(strItems);
        
        for(int x = 0; x < NUMBER_OF_ITEMS; ++ x)
        {
            
           if(orderNumber == ValidValues[x])
           {
             ValidItem = true;
             itemPrice = Prices[x];  
             
           }   
           
        }
            vatcharge = itemPrice*0.14;
            total = vatcharge+itemPrice;
        if (ValidItem)
        JOptionPane.showMessageDialog(null, "The price for item " + orderNumber + " is R" + itemPrice + "\n VAT charge is " + Math.round(vatcharge) + "\nTotal price to be paid including VAT is " + Math.round(total) );
        else 
           JOptionPane.showMessageDialog(null, "the number you have entered is invalid");
    }
    
}
