package algorithms;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args) {
		List<Integer> row = row(4);
		for (int i = 0; i < row.size(); i++) {
			System.out.print(" " + row.get(i));
		}
		
		
		
		System.out.println();
		List<Integer> row4 = row(4);
		
	}
	public static List<Integer> row(int n) {
		if(n == 1){
			ArrayList<Integer> result = new ArrayList<Integer>();
			result.add(1);
			return result;
		}else{
			List<Integer> prevRow = row(n - 1);

			ArrayList<Integer> result = new ArrayList<Integer>();
			
			for (int i = 0; i < n; i++) {
				int j = i - 1;
				int left;
				if (j < 0) left = 0;
				else left = prevRow.get(j);
				int right;
				if (i >= n-1) right = 0;
				else right = prevRow.get(i);
				int sum = left + right;
				result.add(sum);
			}
			return result;
		}
	}
}
