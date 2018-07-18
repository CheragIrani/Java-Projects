package lists;

public class BubbleSort {
	public static void main(String[] args) {
		int[] list = new int[5];
		for(int i = 0; i < 5; i++) {
			list[i] = 5 - i - 1;
		}		
		sortAscending(list);
		for(int i = 0; i < 5; i++) {
			System.out.println(list[i]);
		}
		
	}
	public static void sortAscending(int[] list){
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4 - i; j++){
				if(list[j] > list[j+1]){
					int temp = list[j+1];
					list[j+1] = list[j];
					list[j] = temp;
				}
			}
		}
	}

}
