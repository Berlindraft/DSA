package sort;

public class LinearSearch {

	public static void main(String[] args) {
		// Basic rani
		int nums[] = {5,7,9,11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33};
		int target = 7;
		//pass in arguments to the linearsearch method
		int results = linearSearch(nums, target);
		
		//will only print if the results is not equal to -1
		if(results != -1) {
		System.out.println("Element found at Index: " + results);
		}else {System.out.println("Element not found");}
	}
	//linear search method
	private static int linearSearch(int[] nums, int target) {
		// int size = nums.length;
		// TODO Auto-generated method stub
		for(int i = 0; i < nums.length; i++ ) {
			if(nums[i] == target) {
				return i;
			}
			
		}
		return -1;
	}	

}
