package lists;

public class ArrList {
	public static void main(String[] args) {
		ArrList arr = new ArrList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.removeAt(0);
		System.out.println(arr);
	}
	
	int[] array = new int[5];
	int size;
	
	void add(int a) {
		System.out.println("add " + a);
		System.out.println(array + " " + size);
		array[size] = a;
		size++;
	}
	
	void removeAt(int index) {		
		System.out.println("removeAt " + index);
		
		for(int i = index + 1; i < size; i++) {
			array[i-1] = array[i];
		}
		size--;
		
	}
	
	public String toString(){
		String s = "[";
		for(int i = 0; i < size; i++) {
			s = s + array[i];
		}
		return s + "]";
	}
}
