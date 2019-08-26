package by.epam.jb29.main;

public class Task01 {

	public static void main(String[] args) {
		//Даны два действительных числа х и  у. Вычислить их сумму, разность, произведение и частное. 
		
		float x;
		float y;
		
		x = 10;
		y = 5;
		
		float s;
		float d;
		float p;
		float q;
				
		s = x + y;
		d = x - y;
		p = x * y;
		q = x / y;
				
		System.out.println("Сумма: " + x + " + " + y + " = " + s);
		System.out.println("Разность: " + x + " - " + y + " = " + d);
		System.out.println("Произведение: " + x + " * " + y + " = " + p);
		System.out.println("Частное: " + x + " / " + y + " = " + q);
				
	}

}
