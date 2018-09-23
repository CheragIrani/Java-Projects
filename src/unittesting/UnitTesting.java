package unittesting;

public class UnitTesting {
	public static void main(String[] args) {
		int result = sum(5, 4);
		System.out.println(result);
	}
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int compute(int a) {
		if (a > 0) return -a;
		return -a + 2;
	}

}
