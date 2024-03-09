
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Same ras linearsearch
		int nums[] = {5,7,9,11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33};
		int target = 25;
	
		int results = binarySearch(nums, target);
		
		//will only print if the results is not equal to -1
		if(results != -1) {
		System.out.println("Element found at Index: " + results);
		}else {System.out.println("Element not found");}
	}
	
	private static int binarySearch(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = nums.length-1;
		// makes sure that left is actually less than on the right
		while(left <= right) 
			{
			int mid = (left + right)/2;
			if(nums[mid]== target) {return mid;}
			//if mid is less than the target then we reinitialize the left value vice versa
			else if (nums[mid] < target) {left = mid + 1;}
			else {right = mid - 1;}
			}
			return -1;}
}
