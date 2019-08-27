package by.epam.jb29.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		// TODO Написать код для решения задачи. В n малых бидонах 80 л молока.
		// Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
		
		int n; //quantity of small jars
		// m - quantity of big jars
		double total_big;
					
        Random rand = new Random();
		
		n = rand.nextInt(10);
		
		// supposably n = m		
		// vn - volume of small jar		
		// vm - volume of big jar		
		// vn = 80 / n;
		// vm = vn + 12;		
		// vm = 80 / n + 12	
		// total_big = vm * n
				
		total_big = 80 + 12 * n;
		
		System.out.println("n = " + n);
		System.out.println("Total milk in big jars is " + total_big);	
			
	}

}
