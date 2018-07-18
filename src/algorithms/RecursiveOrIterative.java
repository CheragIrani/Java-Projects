package algorithms;

public class RecursiveOrIterative {
	public static int factorial_r(int n) {
		if (n <= 1) return 1;
		else return n*(factorial_r(n-1));
	}
	
	public static int factorial_i(int n) {
		int ans = 1;
		for (int i = 2; i <= n; i++) {
			ans = ans * i;
		}
		return ans;
	}
	
	public static int fibonacci_r(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) { return 1;}
		else {
			int m = fibonacci_r(n - 1);
			int o = fibonacci_r(n - 2);
			return m + o;
		}
	}
	
	public static int fibonacci_i(int n) {
		if (n == 0) return 0;
		int prev = 0; // prev = fibonacci(0)
		int ans = 1;  // ans = fibonacci(1)
		for (int i = 2; i <=n; i++) {
			int nextAns = prev + ans;
			prev = ans;
			ans = nextAns;
		}
		return ans;
	}
}
