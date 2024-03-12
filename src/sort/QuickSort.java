package sort;

public class QuickSort {

	//ambot unsaon mani pag explain oi huhu
	//anyways this is quicksort, this is a really fast method in sorting values
	//hence the name quicksort
	//start in the main method 
	public static void quickSort(int nums[], int low, int high) {
		//checks if the low is actually lower than the high lmao
		if(low < high) {
			//we try to create a partition to separate the array into parts
			//gets the pivot value
			int pi = partition(nums, low, high);
			//kani nga part nga mo calculate sa pi value, it will return the index mn
			//the index of which the pivot point is located, kung naa nakay pivot
			//ma divide nimo ang array into two parts which is ang high ug low and ang pivot
			//maoy naas tunga. mao pi - 1 to indicate nga left part ni sa pivot nga array
			//mag balik2 rani until ma sorted
			quickSort(nums, low, pi - 1 );
			quickSort(nums, pi + 1, high );
		}
	}
	private static int partition(int[] nums, int low, int high) {
		// so pi = partition mn
		int pivot = nums[high];
		int i = low -1;
		// the pivot is actually used to select a value to use
		// so that the code can be divided into multiple parts
		for(int j = low; j < high; j++) {
			//checks if the j value is less than the pivot value
			// 3, 5, 6, 2, 1 
			if (nums[j] < pivot){
				// increments i here and along with the swapping of the values
				// values such as the last element 
				i++;
				//increment i
				// this exchange the values in their proper order 
				//in other words, in this part
				// this PARTIALLY sorts the array 
				//that in a way the smaller and larger values are 
				//placed on their rightful place between the pivot
				//pero dle technicall rightful place but rather nga na sort between
				//sha sa pivot 
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				
			
			}
			// prints out the sorting process across the iterations
			//you can use this to observe the data being sorted
				System.out.println();
				System.out.println("sorting... " + "pivot: " + pivot + " " + "j["+ j + "]" + nums[j] +  " , " + "i[" + i + "]" + nums[i]);
				for(int num: nums) {
				System.out.print(num + " ");}
			
		}
		// after the sorting of the initial looping and sorting
		// this places the pivot value in its RIGHTFUL place 
		//tungod ni sa I value nga ONLY mo move sha when less than sa pivot
		System.out.print("break out of loop");
		System.out.println();
		int temp = nums[i + 1];
		nums[i + 1] = nums[high];
		nums[high] = temp;
		// nahimo nag  i + 1 because i+1 is the index of the pivot
		return i + 1;  
	}
	
	// starting in the main method we try to call into a function/method that 
	// takes in 3 parameters 
	//the parameters are the arrays and the high and lows
	public static void main(String[] args) {
		int nums[] = {1, 6, 4, 7, 3, 9, 5, 2, 8};
		
		quickSort(nums, 0, nums.length -1);
		//after the method call print the final sorting 
		System.out.println();
		System.out.println("after sorting: ");
		for(int num: nums) {
		System.out.print(num + " ");}
	}

}
