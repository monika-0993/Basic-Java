package Assignment;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the side: ");
		int side = s1.nextInt();
		int area = side * side;
		System.out.println("Area of Square: " + area);
		s1.close();
	}
}
