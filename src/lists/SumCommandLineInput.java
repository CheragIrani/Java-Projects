package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SumCommandLineInput {
	public static void main(String[] args) {
		System.out.println("Enter some numbers");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar  = new ArrayList<Integer>();
		
		while (sc.hasNextInt()) {
			int number = sc.nextInt();
			ar.add(number);
		}
		int result = sum(ar);
		System.out.println("You're numbers are " + result);
	}
	static int sum(ArrayList<Integer> ar) {
		int sum = 0;
		for(int i = 0; i < ar.size(); i++) {
			sum = sum + ar.get(i);
		}
		return sum;
	}
	
}
