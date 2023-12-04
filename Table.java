package com.Study.recursion;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int fact=1;
		table(num,fact);
		// TODO Auto-generated method stub

	}
	public static void table(int num,int fact)
	{
		if(fact==11)
		{
			return;
		}
		else
		{
			System.out.println(num+"*"+fact+"="+num*fact);
			table(num,fact+1);
		}
	}

}
