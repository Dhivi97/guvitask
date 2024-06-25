package task9;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("enter the input number");

int n = sc.nextInt();

for (int i =0; i < n; i++){
	
    if (i==2){
        System.out.println("*");
    }else {
        System.out.println("**");
    System.out.println();
}
}
	}
}

