package by.epam.jb29.main;

import java.util.Scanner;

public class Task07 {	

	public static void main(String[] args) {
		// TODO Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника 
		
		Scanner sc = new Scanner(System.in);
		double h; // ширина прямоугольника
		double s;
		
		
		System.out.print("> ");
		while(sc.hasNextInt() == false) {
			sc.next();	
			System.out.print("> ");	
		}			
			
		h = sc.nextInt();	
							
		s = 2 * h * h;
		System.out.println("s = " + s);

	}

}

