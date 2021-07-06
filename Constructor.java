/*Lab 3.2) Write a Java program to implement constructor. */

class Box 

{

double width;

double height;

double depth;

Box(double w, double h, double d) 

{

width = w;

height = h;

depth = d;

}

double volume() 

{

return width * height * depth;

}

}

class Constructor

{

public static void main(String args[]) {

Box mybox1 = new Box(14,6,12);

Box mybox2 = new Box(4,6,8);

double vol;

vol = mybox1.volume();

System.out.println("Volume is " + vol);

vol = mybox2.volume();

System.out.println("Volume is " + vol);

}

}