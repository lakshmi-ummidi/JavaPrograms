/*Lab 1.2) Five Bikers Compete in a race such that they drive at a constant speed which 

may or may not be the same as the other. To qualify the race, the speed of a 

racer must be more than the average speed of all 5 racers. Take as input the 

speed of each racer and print back the speed of qualifying racers.*/

import java.util.Scanner;

public class FiveRacers {

	public static void main(String[] args) {		double a,b,c,d,e,avg;

		Scanner s=new Scanner(System.in);

		System.out.print("Enter the speeds of five racers:");

		a=s.nextDouble();

		b=s.nextDouble();

		c=s.nextDouble();

		d=s.nextDouble();

		e=s.nextDouble();

		avg=(a+b+c+d+e)/5;

		if(a>avg)

		{

			System.out.println("Racer1 is qualified with speed"+" "+a);

		}

		if(b>avg)

		{

			System.out.println("Racer2 is qualified with speed"+" "+b);

		}

		if(c>avg)

		{

			System.out.println("Racer3 is qualified with speed"+" "+c);

		}

		if(d>avg)

		{

			System.out.println("Racer4 is qualified with speed"+" "+d);

		}

		if(e>avg)

		{

			System.out.println("Racer5 is qualified with speed"+" "+e);

		}

	}

} 