
public class MergeSort {
	
	private static void mergeSort(int nums[], int left, int right) {
		// we are to separate the array into left and right values
		if (left < right) {
			// mid is to determine the mid index of the array
			int mid = (left + right)/2;
			//divides the array into 2 parts
			//the first merge sort includes the mid index
			//while the second is AFTER the mid index
			mergeSort(nums, left, mid);
			mergeSort(nums, mid + 1, right);
			
			//after the recursion of the values, it will merge the values in the merge method
			merge(nums, left, mid, right);
			System.out.println("executed 5");
		}
		
	}
	
	private static void merge(int[] nums, int left, int mid, int right) {
		//n1 and n2 is the size of the array
		// " +1 " is because it is zero index
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		//these are new arrays to take in the partitioned arrays
		//taking in the n1 and n2 as the size of the array
		int lnum[] = new int[n1];
		int rnum[] = new int[n2];
		
		// the ff for loops will store the arrays into new arrays through a loop
		for(int x = 0; x < n1; x++) {
			lnum[x] = nums[left + x];
		} //left + x because it starts with the left index then add the x value
		for(int x = 0; x < n2; x++) {
			rnum[x] = nums[mid + 1 + x];
		} // same here
		
		int i = 0;
		int j = 0;
		int k = left;
		//these variables are to compare and store the array values into new array which will be nums[k]
		
		//compare and contrast
		//
		while(i < n1 && j < n2) {
			
			if(lnum[i] <= rnum[j]  ) {
				nums[k] = lnum[i];
				i++;
				System.out.println("executed (1) ");
			} else {
				nums[k] = rnum[j];
				j++;
				System.out.println("executed (2) ");
			}
			k++;
			//k is incremented because it needs to store the next value after running the if statement
		}
		// these 2 while loops is after the initial sorting
		// if the values of the lnum and rnum are not sorted then
		// the remaining values of the array will be placed in nums[k]
		while(i < n1) {
			nums[k] = lnum[i];
			i++;
			k++;
			System.out.println("executed (3) ");
		}
		while(j < n2) {
			nums[k] = rnum[j];
			j++;
			k++;
			System.out.println("executed (4) ");
		}
		System.out.println();
		System.out.println("sorting... "  + " " + " mid : " + mid + "  j["+ j + "] - " + nums[j] +  " , " + "i[" + i + "] - " + nums[i]);
		for(int num: nums) {
			System.out.print(num + " ");}
	}

	public static void main(String[] args) {
		int nums[] = {1, 6, 4, 7, 3, 9, 5, 2, 8};
		
		//calling int he mergesort method
		mergeSort(nums, 0, nums.length -1);
		
		//after the method call print the final sorting 
		System.out.println();
		System.out.println("after sorting: ");
		for(int num: nums) {
		System.out.print(num + " ");}
		
		
	}
}
