package ro.ase.cts.s02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
     * Aceasta metoda calculeaza suma dintre x ridicat la puterea a-5a si y ridicat la putearea a-7a.
     * @return Returneaza rezultatul calculat.
     * @throws IOException Arunca exceptie daca datele introduse nu au formatul corect.
     */
	public double xPow5(double x) {
		
		double x5 = x;
        for (int i = 1; i < 5; i++) {
            x5 *= x;
        }
        return x5;
	}
	
	public double yPow7(double y) {
		
		double y7 = y;
        for (int i = 1; i < 7; i++) {
            y7 *= y;
        }
        return y7;
	}
	
    public double calculateX5PlusY7() throws IOException {
        double result = 0.0;
        double x = 0, y = 0;
        
        boolean goodInputX = false;
        boolean goodInputY = false;
        
        while(goodInputX == false || goodInputY == false) {
        	
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Tastati valoarea pentru X:");
	        
	        try {
		        x = Double.parseDouble(reader.readLine());
	            goodInputX = true;
	        } catch(NumberFormatException e) {
	        	goodInputX = false;
	        }
	        
	        System.out.println("Tastati valoarea pentru Y:");
	        
	        try {
		        y = Double.parseDouble(reader.readLine());
	            goodInputY = true;
	        } catch(NumberFormatException e) {
	        	goodInputY = false;
	        }
	        
	        if(goodInputX == false && goodInputY == false)
		        System.out.println("Ambele valori nu sunt numerice! Reintroduceti valorile!");
	        else {
	        	if(goodInputX == false && goodInputY == true)
	        		System.out.println("Valoarea lui x nu este numerica! Reintroduceti valorile!");

		        else {
		        	if(goodInputX == true && goodInputY == false)
		        		System.out.println("Valoarea lui y nu este numerica! Reintroduceti valorile!");
		        }
	        }
        }

        result = xPow5(x) + yPow7(y);
        return result;
    }
}