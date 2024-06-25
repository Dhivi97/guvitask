package task9;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter the Value");
int a = sc.nextInt();

if (a == 100) {
	System.out.println("Grade s"); 
	
}else if (a > 100) {
	System.out.println("Invalid Output");
	
}else if (a >=90) {
	System.out.println("Grade A");
	
}else if (a >= 80){
	System.out.println("Grade B");
	
}else if (a >=70) {
	System.out.println("Grade C");
	
}else if (a >=60) {
	System.out.println("Grade D");
	
}else if (a >=50) {
	System.out.println("Grade e");
	
}else 
	System.out.println("Grade F");
	

}
	}



