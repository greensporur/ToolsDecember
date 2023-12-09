package Program;

import java.util.ArrayList;
import java.util.List;

public class List_ {

	public static void main(String[] args) {
		
		
	List<Integer> li = new ArrayList<Integer>();
	
		
		li.add(10);
		li.add(20);
		li.add(30);
		
		try {
			
			System.out.println(li.get(10));
			
			
		}catch(IndexOutOfBoundsException e) {
			
			
			System.out.println(e);
			
		}
	
	}
	
	
	
	
	
}
