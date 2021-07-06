/*Lab 3.1) Write a Java program to display the details of a person. Personal details should 

be given in one method and the qualification details in another method. */

import java.util.*;

class Details

{

	int age;	String gender;

	long mobile;

	String name;

	String schoolname;

    String collegename;

	String graduation;

   void PersonalDetails()

	{

	   System.out.println("Name - "+name);

	    System.out.println("Gender - "+gender);

		 System.out.println("Age - "+age);

		  System.out.println("Mobile - "+mobile);

	}

void Qualification()

	{

	System.out.println("SchoolName - "+schoolname);

	System.out.println("CollegeName - "+collegename);

	System.out.println("Graduation - "+graduation);

	}

}

class BioDetails

{

	public static void main(String args[])

	{

		Scanner s=new Scanner(System.in);

		Details p1=new Details();

		Details p2=new Details();

		System.out.println("Enter the personal Details name ,gender,age,mobile");

		p1.name=s.nextLine();

        p1.gender=s.nextLine();

		p1.age=s.nextInt();

		s.nextLine();

		p1.mobile=s.nextLong();

		System.out.println("Enter Qualification details school name,college name,graduation");

		s.nextLine();

		p2.schoolname=s.nextLine();

		p2.collegename=s.nextLine();

		p2.graduation=s.nextLine();

		p1.PersonalDetails();

		p2.Qualification();

}

}