package rectanglePerimeter;

import java.util.Scanner;

public class recMain {

	public static void main(String[] args) 
	{
		// Variables initialized.
		Scanner scn1 = new Scanner(System.in);
		int height = 0, width = 0, perim = 0;
		
		// Program asks the user to enter the variable "height".
		System.out.println("To find the Perimeter of a Rectangle,");
		System.out.println("");
		System.out.print("Enter height: ");
		height = scn1.nextInt();
		
		System.out.println("");
		System.out.println("");
		
		// Program asks the user to enter the variable "width".
		System.out.print("Enter width: ");
		width = scn1.nextInt();
		System.out.println("");
		
		// Perimeter Calculation.
		perim = (height + width) * 2;
		
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println("Perimeter of this rectangle = " + perim);
		scn1.close();
	}

}
