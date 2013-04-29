package com.osgo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
// The Controller coordinates interactions between the View and Model
 
public class CalculatorController
{  
    private CalculatorView theView;
    private CalculatorModel theModel;
     
    public CalculatorController(CalculatorView theView, CalculatorModel theModel)
    {
        this.theView = theView;
        this.theModel = theModel;
         
        // Tell the View that when ever the calculate button
        // is clicked to execute the actionPerformed method
        // in the CalculateListener inner class
         
        this.theView.addCalculateListener(new CalculateListener());
    } // end constructor
    
     
    class CalculateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
             
            int firstNumber, secondNumber = 0;
             
            // Surround interactions with the view with a try block
            // (in case numbers weren't properly entered).
             
            try
            {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                 
                theModel.addTwoNumbers(firstNumber, secondNumber);
                 
                theView.setCalcSolution(theModel.getCalculationValue());
            } // end try
 
            catch(NumberFormatException exception)
            {
                System.out.println(exception);
                theView.displayErrorMessage("Please enter 2 integers");
            } // end catch
             
        } // end method actionPerformed
         
    } // end Class CalculateListener
   
} // end Class CalculatorController
