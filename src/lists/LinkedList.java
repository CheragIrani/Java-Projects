package lists;

public class LinkedList {
	public static class Node {
		public Node next;
		public int value;
	}
	
	public static void main(String[] args) {
		Node n1 = new Node();
		n1.value = 1;
		Node n2 = new Node();
		n2.value = 2;
		Node n3 = new Node();
		n3.value = 3;
		
		n1.next = n2;
		n2.next = n3;
		
		sum(n1);
	}
	
	public static int sum(Node node) {
		int sum = 0;
		while (node != null) {
			sum = sum + node.value;
			node = node.next;
		}
		return sum;
	}
	
	public static int size(Node node) {
		int size = 0;
		while (node != null) {
			node = node.next;
			size = size + 1;
		}
		return size;
	}
}
