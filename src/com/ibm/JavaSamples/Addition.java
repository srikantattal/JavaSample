package com.ibm.JavaSamples;

public class Addition {
	
	public String  addTwoNumbers(String firstNumber,String secondNumber){
		
		System.out.println("Input variables is "+firstNumber+" and " +secondNumber);
		
		return String.valueOf(Integer.parseInt(firstNumber)+Integer.parseInt(secondNumber));
	}

}
