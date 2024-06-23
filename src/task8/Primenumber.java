package task8;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for not prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
	}

}
