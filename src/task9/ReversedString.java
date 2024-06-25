package task9;

public class ReversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String String = " All is Well ";
        //stores the reverse of given String
        String reversedStr ="";

        for (int i = String.length()-1; i >=0; i--){
            reversedStr = reversedStr + String.charAt(i);
        }


        System.out.println("Original String:" + String);
        //reverse String
        System.out.println(" Reverse of given String:" + reversedStr);
	}

}
