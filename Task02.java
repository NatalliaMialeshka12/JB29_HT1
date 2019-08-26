package by.epam.jb29.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		//Найдите  значение функции: с = 3 + а. 
		
		int a, c;
		
		Random rand = new Random();
		
		a = rand.nextInt(100);					
		c = 3 + a;			
					
		System.out.println(c + " = " + 3 + " + " + a);

	}

}
