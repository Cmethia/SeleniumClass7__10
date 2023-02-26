package com.Automation.code.AUTOMATION;

public class VariableL {
	
	public static void main(String[] args) {
	//WAP to print first 100 multiple of 5 and add those multiples 
		//5, 10, 15....500
	int i=5;
	int sum=0;
	while(i<=5*100) {
		System.out.println(i);
		i=i+5;
		sum=sum+i;
		System.out.println("the addition is ="+sum );
	}
	
	}	
}
