package by.epam.jb29.main;

public class Task09 {
	
	        // TODO Вычислить значение выражения по формуле (все переменные принимают действительные значения):
			// 𝑎 𝑐 ∗ 𝑏 𝑑 − 𝑎𝑏 − 𝑐 𝑐𝑑	
        private static double calculateFormula(double a, double b, double c, double d) {
		
		if(c == 0  || d == 0)
		throw new IllegalArgumentException("Argument can not be zero"); 
	    	
        
        return ((a / c) * (b / d)) - ((a * b - c) / (c * d));}
        

	public static void main(String[] args) {
		
	System.out.println(calculateFormula(1, 2, 3, 4));				 

	}

}
