package passwordapp;

import java.util.ArrayList;

public class PasswordCheckerTest {
	
	public static void main(String args[]) {
		notUserName();
		noSpace();
		notBlank();
		complete();
	}

	/// check passwords equal to username are not valid.
	public static void notUserName(){
		PasswordChecker checker = new NotUserName();
		if (checker.isValid("Cherag", "Cherag") == true) System.out.println("Fail not user name (1)");
		if (checker.isValid("Cherag", "123") == false) System.out.println("Fail not user name (2)");
	}

	/// check passwords have no spaces.
	public static void noSpace(){
		PasswordChecker checker = new NoSpace();
		if (checker.isValid("Cherag", "abc d") == true) System.out.println("Fail no space (1)");
		if (checker.isValid("Cherag", "123") == false) System.out.println("Fail no space (2)");
	}

	/// check passwords are not blank.
	public static void notBlank(){
		PasswordChecker checker = new NotBlank();
		if (checker.isValid("Cherag", "") == true) System.out.println("Fail not blank (1)");
		if (checker.isValid("Cherag", "123") == false) System.out.println("Fail not blank (2)");
	}

	/// check passwords are like we want them.
	public static void complete(){
		ArrayList<PasswordChecker> checkers = new ArrayList<PasswordChecker>();
		checkers.add(new NotUserName());
		checkers.add(new NotBlank());
		checkers.add(new NoSpace());
		PasswordChecker checker = new Composite(checkers);
		if (checker.isValid("Cherag", "") == true) System.out.println("Fail complete (1)");
		if (checker.isValid("Cherag", "Cherag") == true) System.out.println("Fail complete (2)");
		if (checker.isValid("Cherag", "Cher ag") == true) System.out.println("Fail complete (3)");
		if (checker.isValid("Cherag", "123") == false) System.out.println("Fail complete (4)");
	}
}
