package by.epam.jb29.main;

public class Task05 {

	
	public static void main(String args[]){
	      
		
		        
		  double a = (double) (Math.random() * 100); // Генерация 1-го числа
		  double a_roundOff = (double) Math.round(a * 100) / 100;
	      System.out.println("a = " + a_roundOff);
	      
	      double b = (double) (Math.random() * 10); // Генерация 2-го числа
	      double b_roundOff = (double) Math.round(b * 100) / 100;
	      System.out.println("b = " + b_roundOff);
	     
	      double c;
	      
	      c = (a + b)/2;
	      
	      double c_roundOff = (double) Math.round(c * 100) / 100; 
	     
	      System.out.println("Среднее арифметическое чисел равно " + c_roundOff);
	      
	 }
	
}