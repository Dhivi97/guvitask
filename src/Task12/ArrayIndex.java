package Task12;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr = {1,2,3,4,5};
	        try {
	            int number = arr[5];
	        }catch (ArrayIndexOutOfBoundsException e){
	            System.out.println("arrayIndexOfBoundException caught");
	            System.out.println("e.getMessage() = " + e.getMessage());
	        }

	        String str = "hello world";
	        try {
	            char chr = str.charAt(20);
	            }catch (StringIndexOutOfBoundsException e){
	            System.out.println("stringIndexOutOfBoundsException caught");
	            System.out.println("e.getMessage() = " + e.getMessage());
	            
	        }
	}

}
