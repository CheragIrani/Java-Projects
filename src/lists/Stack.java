package lists;

public class Stack {
	public static void main(String[] args) {
		Stack arr = new Stack();
		arr.push(1);
		arr.push(2);
		arr.push(3);
		int popped = arr.pop();
		System.out.println(popped);
		popped = arr.pop();
		System.out.println(popped);
		
		System.out.println(arr);
	}
	
	int[] array = new int[5];
	int size;
	
	void push(int a) {
		System.out.println("add " + a);
		System.out.println(array + " " + size);
		array[size] = a;
		size++;
	}
	
	int pop() {
		System.out.println("pop ");	
		size--;
		return array[size];
		
	}
	
	public String toString(){
		String s = "[";
		for(int i = 0; i < size; i++) {
			s = s + array[i];
		}
		return s + "]";
	}
}
