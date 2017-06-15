package example;

import java.util.Scanner;

public class Example {
public static void main(String args[]){
	int num1;
	int num2;
	int num3;
	
	Scanner sc=new Scanner (System.in);
	System.out.println("enter any three numbers:");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	
        if (num1>num2 && num1>num3)	
		{		
		System.out.println("the highest number is :"+num1);
		}
       
	else if (num2>num1 && num2>num3)
	 {
		 System.out.println("the highest number is :" +num2);
	 }
	 else if (num3>num1 && num3>num2)
	 {
	System.out.println("the highest number is:" +num3);
	 }
	else
		System.out.println("the numbers are not distinct");
	}
}