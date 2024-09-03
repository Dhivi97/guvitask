package Task12;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division By zero is Not Allowed");
            System.out.println("e.getMessage() = " + e.getMessage());
        

	
        }

		
	}

}
