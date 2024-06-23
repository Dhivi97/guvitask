package task8;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, num = 452;

        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("count = " + count);
	}

}
