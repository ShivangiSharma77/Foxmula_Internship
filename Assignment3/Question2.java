  
/*
* program to throw Custom Exception with proper message Number is invalid if number is prime and odd
* @author  Shivangi Sharma
* 
*/
package com.foxmula.DailyTask3;
import java.util.Scanner;

class Invalid extends Exception{
	public Invalid(String msg) {
		super(msg);
	}
}
public class ExceptionOddElement {
	private static boolean Prime(int num) {
	for(int i=2;i<num/2;i++) {
			if(num%i == 0 ) {
			  System.out.println("Not Prime");
			  return false;
		}}
	return true;
	}
void PrimeOdd(int num) throws Invalid{
		if(Prime(num) && num%2!=0 && num>1) {
			throw new Invalid("Invalid Number");
		  }
		else
    {
		System.out.println("Not prime and odd");
		}
	  }
	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the number:");
	int num=scanner.nextInt();
		try {
			PrimeOdd(num);	
		}
		catch (Exception e) {
			System.out.println("Exception: "+e);
		}	
	}
}
