package datastructures;

public class calcmaxhourglassval {

	public static void main(String[] args) {
		
		int arr [][] = {{-9,-9,-9,1,1,1},{0,-9,0,4,3,2},{-9,-9,-9,1,2,3},{0,0,8,6,6,0},{0,0,0,-2,0,0}, {0,0,1,2,4,0}};
		int maxsum = -1000;
		int result = 0;
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j<5; j++) {
				maxsum = arr[i][j] + arr[i+1][j] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i - 1][j - 1] + arr[i + 1][j + 1] + arr[i + 1][j - 1];
				
				if (result < maxsum) 
					result = maxsum;
				
			}
		}
		
		System.out.println(result);
	}

}
