package by.epam.jb29.main;

public class Task04 {
	
	public static void main(String args[]){
	      int x = 0; // Начальное значение диапазона - "от"
	      int y = 100; // Конечное значение диапазона - "до"
	      int z;
	      
	      int a = x + (int) (Math.random() * y); // Генерация 1-го числа
	      System.out.println("a = " + a);
	      
	      int b = x + (int) (Math.random() * y); // Генерация 2-го числа
	      System.out.println("b = " + b);
	     
	      int c = x + (int) (Math.random() * y); // Генерация 3-го числа
	      System.out.println("c = " + c);
	      
	      z = ((a - 3) * b / 2) + c;
			
	  	  System.out.println(z + " = " + "( ( " + a + " - " + 3 + " ) * " + b + " / " + 2 + " ) " + " + " + c);
	      
	 }
	
}

		   