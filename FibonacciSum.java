/* Lab 2.2) Write a Java program to Find the sum of all even terms in the Fibonacci 

sequence up to the given range N.*/

import java.util.Scanner;

public class FibonacciSum

{

	public static void main(String[] args)	{

		int n,sum=0,f,temp,i,x=0,y=1;

		Scanner s=new Scanner(System.in);

		System.out.print("Enter a number:");

		n=s.nextInt();

		for(i=0;i<=n;i++)

		{

			temp=x;

			f=x+y;

			x=y;

			y=f;

			if(temp%2==0)

			{

				sum=sum+temp;

			}

		}

		System.out.format("The sum of all even terms in fibonacci sequence upto the range %d is %d",n,sum);

	}

}