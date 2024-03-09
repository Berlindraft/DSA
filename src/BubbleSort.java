
public class BubbleSort {

	public static void main(String[] args) {
		int nums[] = {1, 9, 2, 6, 4, 7, 3, 5, 8, 0};
		int temp = 0;
		int size = nums.length;
		
		System.out.println("before sorting: ");
		for(int num: nums) {
			System.out.print(num + " ");
		}
		//basically just swaps the value until in reaches the end of the array 
		// then a key feature about bubble sorting is that we dont have to sort
		// the last values because it is already sorted. hence size-i-1
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size-i-1; j++) {
				if(nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
				System.out.println();
				for(int num: nums) {
					System.out.print(num + " ");}
			}
		}
		
		System.out.println();
		System.out.println("after sorting: ");
		for(int num: nums) {
			System.out.print(num + " ");
		}
		
	}

}
