package algorithms;

public class Dichotomy {
	public static void main(String[] args){
		int[] values = new int[]{2, 5, 7, 9 , 11, 13, 17, 19, 23};
		int indexOf13 = search_r(values, 14);
		System.out.println("index: " + indexOf13);
	}
	
	public static int search_r(int[] values, int valueToFind) {
		return search_r(values, valueToFind, 0, values.length - 1);
	}
	
	public static int search_r(int[] values, int valueToFind, int left, int right) {
		if (left == right) return left;
		if (values[left] >= valueToFind) return left;
		if (values[right] <= valueToFind) return right;
		if (left + 1 == right) return left;
		int middle = (left + right) / 2;
		if (values[middle] == valueToFind) return middle;
		if (values[middle] > valueToFind) return search_r(values, valueToFind, left, middle);
		else return search_r(values, valueToFind, middle, right);
	}
}
