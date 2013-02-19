package kalkulator;

public class MyKalkulator {

	public int mnozenie(int a, int b) {
		    if ((a > 99) || (b > 99)) {
		      throw new IllegalArgumentException("Argument mnożenia nie może być wiekszy niz 99");
		    }
		    return a * b;
		  }
	
	public MyKalkulator()
	{
	}

}
