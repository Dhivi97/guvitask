package tasks12;

import java.util.TreeMap;
import java.util.TreeSet;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> employeeId = new TreeMap<>();
        employeeId.put(1,"Kimayaa");
        employeeId.put(2,"Ramyaa");
        employeeId.put(3,"Thulir");
        employeeId.put(4,"Gowtham");

        TreeSet<String> sortName = new TreeSet<>(employeeId.values());

        System.out.println("order by Alphabetical");
        for (String name : sortName){
            System.out.println("name = " + name);
        }
		
	}

}
