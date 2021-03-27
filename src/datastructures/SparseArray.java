package datastructures;

public class SparseArray {

	public static void main(String[] args) {
		
		String [] strings = {"ab", "ab", "abc"};
		String [] queries = {"ab", "abc", "bc"};
		
		int [] result = new  int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			
			int count = 0;
			
			for (String string: strings) {
				if(string.equals(queries[i]))
					count++;
			}
			result[i] = count;
		}
		
		System.out.println(result[2]);
	}

}
