public class ReverseArray {

	static void rvereseArray(int arr[], int start , int end) {		
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
