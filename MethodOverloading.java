/*Lab 3.3) Write a Java program to implement method overloading.*/

class Add

{

void addition(int a,int b)

{

System.out.println (a+b);

}

void addition(int a,int b,int c)

{

System.out.println (a+b+c);

 }

}

class MethodOverloading

{

public static void main(String[] args)

{

Add a1=new Add();

a1.addition(17,56);

a1.addition(34,78,45);

}

}