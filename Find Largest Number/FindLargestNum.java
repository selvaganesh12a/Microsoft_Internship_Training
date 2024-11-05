import java.util.*;
public class FindLargestNum {
    static int largest(int n){
        int ans = 0;
        int num = n;
        int len = 0;
        while(num != 0){ // loop to find the length of the number
            len += 1;
            num /= 10;
        }
        int[] temp = new int[len]; // temporary Array creation to store the number in the array format
        for (int i = 0; i < temp.length; i++) {
            temp[i] = n % 10;
            n /= 10;
        }
        insertion(temp); // insertion sort to sort the array temp
        for (int i = 0; i < temp.length; i++) {
            ans += temp[i]*Math.pow(10, i); // storing the number in reverse order
        }
        return ans;
    }

    static void insertion(int[] arr){ //insertion sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
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
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        System.out.println("The largest number : ");
        System.out.println(largest(num)); // Function Calling
    }
}
