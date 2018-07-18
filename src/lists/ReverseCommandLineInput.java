package lists;

import java.util.Scanner;

public class ReverseCommandLineInput {
	public static void main(String[] args) {
		System.out.println("Enter your word here!");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < word.length(); i++) {
			sb.append(word.charAt(word.length()-i-1));
		}
		System.out.println(sb.toString());
	}
}
