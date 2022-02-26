package longestincreasingsubsequence;


import java.util.ArrayList;
import java.util.Scanner;

public class LISMain {
	
	
		public int[] findLISList() {
	
		Scanner scan = new Scanner(System.in);
		//Asking for user input to get a number of integers to add to the array.
		//Must be less than 100 numbers to the list.
		System.out.println("How many numbers would you like to use? (Must be less than 100 numbers.)");
		int num = scan.nextInt();
		int[] arr= new int[num];
		
		System.out.println("Enter numbers one at a time (Remember: less than 100 numbers.)");
			for (int i = 0; i < num; i++) {
				arr[i] = (scan.nextInt());
			
			}
			scan.close();
			return arr; 
		
		
	}		//Finding length of LIS. 
			public static void lengthOfIncSub(int[] arr){
			
					
			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<Integer> listLongest = new ArrayList<Integer>();
			int currentMax;
			int maxCount = 0;
						
			for (int i = 0; i < arr.length; i++) {
				currentMax = Integer.MIN_VALUE;
				for (int j = i; j < arr.length; j++) {
				if (arr[j] > currentMax) {
					list.add(arr[j]);
					currentMax = arr[j];
				}
			}
				if (maxCount < list.size()) {
					maxCount = list.size();
					listLongest = new ArrayList<Integer>(list);
							
					}
					
					list.clear();
					
			 }
					
				//Printing out LIS and the length.
					System.out.println("The Longest Increasing Subsequence is: " + listLongest);
					System.out.println("--------------------------------------");
					System.out.println("The length of the LIS is: " +listLongest.size());
				
			}
			public static void main(String[] args) {
				LISMain lis = new LISMain();
				int[] arr = lis.findLISList();
				LISMain.lengthOfIncSub(arr);
			
	}
}