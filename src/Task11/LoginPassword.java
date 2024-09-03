package Task11;

import java.util.Scanner;

public class LoginPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		        try (Scanner scanner = new Scanner(System.in)) {
		            int num1 = scanner.nextInt();
		            int num2 = scanner.nextInt();

		            if (num1 == num2){
		                System.out.println("Password is Same");
		            }else {
		                System.out.println("password is Not Same");
		            }
		        }catch (Exception e){
		            System.out.println("Invalid Password = " + e.getMessage());
		        }


	}

}
