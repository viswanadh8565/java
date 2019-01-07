package com.icicibank.loans.homeloans;

import java.util.Scanner;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		/*int a[]= {10,20,30,40};
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int asize = sc.nextInt();
		int a[]=new int[asize];
		int sum=0;
		
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of Array Is :" + sum);	
	}

}
