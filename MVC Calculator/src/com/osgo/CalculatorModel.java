package com.osgo;

//The Model performs all the calculations needed, and that is it.
// (It doesn't know the View exists!).
// The Model contains the data, performs the method,
// and provides access to the data.

public class CalculatorModel
{

 // Holds the value of the sum of the numbers entered in the view.
  
	private int calculationValue;
  
	public void addTwoNumbers(int firstNumber, int secondNumber)
	{  
		calculationValue = firstNumber + secondNumber; 
	} // end method addTwoNumbers
  

	public int getCalculationValue()
	{
		return calculationValue;
	} // end method getCalculationValue

} // end Class CalculatorModel
