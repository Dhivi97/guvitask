package Task12;

import java.util.Scanner;

import Task11.CustomException;

public class CE extends Exception {
	
	public CE(String message){
        super();
	}

        public static void checkAge(int age) throws CustomException {
		
	
		            if (age < 18){
		                throw new CustomException("Age must be 18 or above");
		            }else {
		                System.out.println("Age is valid, you are allowed");
		            }
		    }

        public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println(" enter the age");
		        int age = scanner.nextInt();
		        try {
		            checkAge(age);
		        } catch (CustomException e) {
		            System.out.println("InvalidAge Exception = " + e.getMessage());
		        }


	}

}
