package tasks12;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<String> arrStrList = new ArrayList<>();
	        arrStrList.add("Tiger");
	        arrStrList.add("Lion");
	        arrStrList.add("elephant");

	        System.out.println("ArrayList  before removing" + arrStrList);
	        
	        arrStrList.clear();

	        System.out.println(" ArrayList After Removing" + arrStrList);
	    }
	        
		
	}


