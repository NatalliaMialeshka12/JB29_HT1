package by.epam.jb29.main;

import java.util.Random;

public class Task08 {	

	public static void main(String[] args) {
		// Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑏 + √𝑏2 + 4𝑎𝑐 2𝑎 − 𝑎3𝑐 + 𝑏−2 
		
    int a, b, c;
    double x;
    
	Random rand = new Random();		
	a = rand.nextInt(10);
	b = rand.nextInt(10);
	c = rand.nextInt(10);
		
	double d; // 𝑏2 + 4ac
	double g; // √𝑏2 + 4𝑎𝑐 
	double e; // 𝑎3
	double f; //  𝑏−2 	 
	
	d = Math.pow(b, 2) + 4 * a * c;
	g = Math.sqrt(d);
	e = Math.pow(a, 3);
	f = Math.pow(b, -2);
	
	x = (b + g) / (2 * a) - e * c + f;
	
	System.out.println("a= " + a);
	System.out.println("b= " + b);
	System.out.println("c= " + c);
	System.out.println("x = " + x);

	}

}
