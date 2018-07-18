package appointmentapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Containers {

	public static void main2(String[] args) {
		// Arrays
		// They have a fix size (length):
		Appointment[] array = new Appointment[2];
		// get the length of array:
		int lengthArray = array.length; // = 2
		// Set first and second items of this array:
		array[0] = new Appointment();
		array[1] = new Appointment();
		// Get first and second items of this array:
		Appointment array1 = array[0];
		Appointment array2 = array[1];
		
		// List comes in several flavours: ArrayList and LinkedList and others
		ArrayList<Appointment> list = new ArrayList<Appointment>();
		// get the size of the list:
		int sizeList = list.size(); // = 0
		// Add a first appointment:
		list.add(new Appointment());
		// But we can't add a doctor to it:
		//list.add(new Doctor());
		// Now if we ask for the size:
		sizeList = list.size(); // = 1
		// And we can remove items;
		list.remove(0);
		
		// Sets are list without duplicates
		HashSet<Appointment> set = new HashSet<Appointment>();
		Appointment a1 = new Appointment();
		set.add(a1); // now set.size() = 1
		set.add(a1); // now set.size() = 1
		
	}
	public static void main(String[] args) {
		// create a new list of Integer:
		ArrayList<Integer> l = new ArrayList<Integer>(10);
		// add the first 6 prime numbers:
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(11);
		
//		for (int i = 0; i < l.size(); i++){
//			int value = l.get(i);
//			System.out.println(value);
//		}
		System.out.println();
		System.out.print("[");
		for (Integer value: l) {
			System.out.print(value);
			System.out.print(",");
		}
		System.out.println("]");
		
		l.set(0, 13);
		l.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				if (x.intValue() < y.intValue()) {
					return -1;
				} else if (x.intValue() > y.intValue()){
					return +1;
				} else {
					return 0;
				}
			}
			
		});
		
		System.out.println();
		System.out.print("[");
		for (Integer value: l) {
			System.out.print(value);
			System.out.print(",");
		}
		System.out.println("]");
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Cherag");
		names.add("Pierre");
		names.add("Theresa");
		names.add("Pierre");
		names.add("Pierrea");
		names.add("Pierreasd");
		
		names.sort(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				
				for (int i = 0; (i < o1.length()) && (i < o2.length()); i++) {
					char c1 = o1.charAt(i);
					char c2 = o2.charAt(i);
					if (c1 < c2) {
						return -1;
					} else if (c1 > c2) {
						return +1;
					}
				}
				if (o1.length() < o2.length()) {
					return -1;
				} else if (o2.length() < o1.length()) {
					return +1;
				}
				return 0;
			}});


		System.out.println();
		System.out.print("[");
		for (String value: names) {
			System.out.print(value);
			System.out.print(",");
		}
		System.out.println("]");
	}
}
