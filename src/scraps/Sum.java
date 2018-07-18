package scraps;

public class Sum {

	public static void main(String[] args) {
		ifElseExample();
	}
	
	public static void factorial(int n) {
		int ans = 1;
		for (int i = 1; i <= n ; i = i + 1) {
			ans = ans * i;
		}
		System.out.println("n! = " + ans);
	}

	public static void sumMultipleOf3() {
		int n = 7;
		int ans = 0;
		int i = 3;
		// solution with while:
		while (i<n){
			ans = ans + i;
			i = i + 3;
		}
		
		System.out.println("n = " + n + " sum of multiples of 3 below n: " + ans);
		
		// solution with for
		ans = 0;
		for (i = 3; i < n; i = i + 3) {
			ans = ans + i;
		}
	}
	
	public static void doWhileExample() {
		int n = 3;
		do {
			System.out.println("Hello " + n);
			n = n -1;
		} while (n > 0);
	}
	
	public static void ifElseExample() {
		boolean test = false;
		boolean otherTest = false;
		if (test) {
			System.out.println("It's true!");
		} else if (otherTest) {
			System.out.println("It's false!");
		} else {
			System.out.println("It's completely false");
		}
	}
}
