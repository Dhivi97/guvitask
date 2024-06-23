package task8;

import java.util.Scanner;

public class ValueSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("before swapping "+ a + " is " +b);

int c = a;
a = b;
b = c;

System.out.println("after swapping "+ a + " is "+ b);

	}

}
