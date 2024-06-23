package task8;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("enter the value a" );
int a = sc.nextInt();


if (a % 2 == 0) {
	System.out.println( a + " is an even number");
}else {
	System.out.println(a + " is  an odd number");

	System.out.println("end of the program");
	
	}
	}
}
