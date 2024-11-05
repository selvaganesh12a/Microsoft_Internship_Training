import java.util.Arrays;
import java.util.Scanner;

public class chocolate {
    static int[] task(int[] nums){
        insertion(nums,nums.length); // sorting the array 
        int e = nums.length - 1; // used as a end pointer to swap the 0's
        for (int i = 0; i < nums.length / 2; i++) {
            if(nums[i] == 0){
                swap(nums,i,e); // swap function to swap the zeroes to the last position
                e -= 1; // move the end pointer to previous index
            }
        }
        return nums;
    }

    static void insertion(int[] arr,int e){ //insertion sort algorithm
        for (int i = 0; i < e - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else
                    break;
            }
        }
    }

    static void swap(int[] arr, int first, int second){ // swap function used in the insertion function
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) { // Array storing
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(task(nums)));// printing the answer array
    }
}
