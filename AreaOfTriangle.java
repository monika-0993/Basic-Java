package Assignment;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of base: ");
		int base = s1.nextInt();
		System.out.println("Enter the value of height: ");
		int height = s1.nextInt();
		double area = .5 * base * height;
		System.out.println("Area of Triangle: " + area);
		s1.close();
	}
}
