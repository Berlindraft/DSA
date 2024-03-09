
public class SelectionSort {

	public static void main(String[] args) {
	//swapping values in minimum/maximum value
		int nums[] = {1, 9, 2, 6, 4, 7, 3, 5, 8, 0};
		int temp = 0;
		int minIndex = -1;
		int size = nums.length;
		
		System.out.println("before sorting: ");
		for(int num: nums) {
			System.out.print(num + " ");}
			//kapoya explain
		//basically just loops through an array and find the min/max
		for(int i = 0; i < size - 1; i++) {
			minIndex = i; // this is so that i starts with the outer for loop index
							// that will be the value at the start of the sort
			for(int j = i + 1; j < size; j++) {
				if(nums[minIndex] > nums[j]) {
					minIndex = j; // checks if the minIndex is greater than current index
									// then perform a swap for the minimum value
				}
			}	
			temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;
			// after it has checked for the minimum index then it will put it in the first 
				// index of the array
			
			System.out.println();
			for(int num: nums) {
				System.out.print(num + " ");}
		
		}
		System.out.println();
		System.out.println("after sorting: ");
		for(int num: nums) {
		System.out.print(num + " ");}
		
	}
}
