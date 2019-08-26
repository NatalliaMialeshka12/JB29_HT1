package by.epam.jb29.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		//Find a value of function z = 2 * x + ( y – 2 ) * 5
		
		int x, y, z;
		
		Random rand = new Random();
		
		x = rand.nextInt(10);
		y = rand.nextInt(10);
					
		z = 2 * x + (y - 2) * 5;	
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
					
		System.out.println(z + " = " + 2 + " * " + x + " + " + "( " + y + " - " + 2 + " ) * " + 5);

	}

}
