
public class InsertionSort {
// this sorting method use shifting of the values 
	public static void main(String[] args) {
		int nums[] = {1, 2, 6, 4, 7, 3, 5, 9, 8};
		int size = nums.length;
		// the before sorting of numbers
		System.out.println("before sorting: ");
		for(int num: nums) {
			System.out.print(num + " ");}
		// in here we try to determine the size of the array to be looped through
		// and here we try to initialize the key values and pairs(j)
		for(int i = 1; i < size; i++) {
			int key = nums[i];
			int j = i-1; // j is behind the i value
			//e.g. i = 1 and j = 0 or i-1
			// i is used as the key value to be shifted 
			while(nums[j] > key && j >= 0) {
				//if the j value greater than the key then we will shift the j value plus 1 
				// into the NEW j value
				nums[j+1] = nums[j];
				//we keep on decreasing the value of j until 0
				j--;
				System.out.println();
				for(int num: nums) {
					System.out.print(num + " ");}
			}
			// this is the new empty location because of the shifting
			nums[j+1] = key;
		}
		System.out.println();
		System.out.println("after sorting: ");
		for(int num: nums) {
		System.out.print(num + " ");}
	}

}
