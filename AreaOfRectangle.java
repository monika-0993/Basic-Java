package Assignment;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of length:");
		int length = s1.nextInt();
		System.out.println("Enter the value of breadth:");
		int breadth = s1.nextInt();
		int area = length * breadth;
		System.out.println("Area of Rectangle: "+ area);
		s1.close();
	}
}
