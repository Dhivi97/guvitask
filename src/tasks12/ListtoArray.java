package tasks12;

import java.util.ArrayList;
import java.util.List;

public class ListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
        list.add("Gowtham");
        list.add("Thulir");
        list.add("Boopalan");

        System.out.println("list = " + list);

        String[] str = new String[list.size()];
        str = list.toArray(str);

        for (String ele : str){
            System.out.println("ArrayElement = " + ele);
        }

		
	}

}
