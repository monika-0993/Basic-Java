package Assignment;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
Scanner s1 = new Scanner(System.in);
System.out.println("Enter the value of radius:");
double pi =Math.PI;
double radius = s1.nextDouble();
double area  = pi*radius*radius;
System.out.println("Area of Circle: " + area);
s1.close();
	}

}
