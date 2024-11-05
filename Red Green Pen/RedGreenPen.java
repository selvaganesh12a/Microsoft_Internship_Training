import java.util.Scanner;

public class RedGreenPen {
    static int switchCount(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] % 2 == 1 && nums[i+1] % 2 == 0){ // checking the adjacent number in the array whether it is even or odd and increment the count
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) { // Array storing
            nums[i] = in.nextInt();
        }
        System.out.println("The No.of Times Switch made is : "+switchCount(nums));
    }
}
