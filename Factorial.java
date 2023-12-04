package com.Study.recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int fact=1;
		factorial(num,fact);
	}
	public static void factorial(int num,int fact)
	{
		if(num==0)
		{
			System.out.println(fact);
		}
		else
		{
			factorial(num-1,fact*num);
		}
	}
}
