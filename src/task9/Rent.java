package task9;

import java.util.Scanner;

public class Rent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

	    int m=sc.nextInt();

	    float r=sc.nextFloat();

	    int d=sc.nextInt();

	    float t=r*d;

	    double tr=(1.2)*r*d;

	    switch(m)

	    {

	        case 1:

	                System.out.printf("%.2f",t);

	                break;

	        case 2:

	                System.out.printf("%.2f",t);

	                break;

	        case 3:

	                System.out.printf("%.2f",t);

	                break;

	       


	        default:

	            System.out.println("Invalid Input");
	}

	}
}
