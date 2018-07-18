package lists;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args){
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(5);
		ar.add(10);
		ar.add(15);	
		int total = sum(ar);
		System.out.println(total);
	}
	static int sum(ArrayList<Integer> ar) {
		int result = 0;
		for(int i = 0; i < ar.size(); i++) {
			result = result + ar.get(i);
		}
		return result;
	}
	
}
