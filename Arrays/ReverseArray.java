public class ReverseArray {
	static void reverseArray(int arr[], int start , int end) {		
		//[2,3,6,8,1,5]
		// Idea is to swap (2,5), then (3,1) and finally (6,8) then stop.
		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
	} 
	static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    } 
}
