

import java.util.Scanner;
public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double num1;
		double num2;
		String opp;
		calc Calc = new calc();
		
		
		
		System.out.print("Please enter your first number: " );
	    num1 = scanner.nextDouble();
	    scanner.nextLine(); // remove line terminator character
	    Calc.setNum1(num1);
	    
	    
	    System.out.print("Please enter your opperator: " );
	    opp = scanner.nextLine();
	    Calc.setOpp(opp);
	    
	    
	    System.out.print("Please enter your second number: " );
	    num2 = scanner.nextDouble();
	    scanner.nextLine(); // remove line terminator character
	    Calc.setNum2(num2);
	    
	    
	    if (opp.equals("-")) {
            System.out.printf("The substraction is: %.2f", num1 - num2);
        } else if (opp.equals("+")) {
            System.out.printf("The addition is: %.2f", num1 + num2);
        } else if (opp.equals("x") || opp.equals("*")) {
            System.out.printf("The multiplication is: %.2f", num1 * num2);
        }else if (opp.equals("/")) {
        	System.out.printf("The division is: %.2f", num1 / num2);
        }else {
        	System.out.print("Please enter a valid operator");
        }

	    System.out.print("Code By Ruan Simo, isruan.com" );
	}

}
