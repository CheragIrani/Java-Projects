package lists;

import java.util.Scanner;

public class PasswordLength {
	public static void main(String[] args) {
		System.out.println("Input your password");
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		if(password.length() > 8) {
			System.out.println("You're password is too long mate.");
			System.out.println("More specifically, you're password is " + (password.length() - 8) + " characters too long.");
		}
		else	System.out.println("You're in because you're password is " + password.length() + " characters long");
		
	}
}
