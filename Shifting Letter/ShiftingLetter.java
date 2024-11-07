
import java.util.Scanner;


public class ShiftingLetter {
    static String shift(String s,int[] nums){
        String ans = "";
        int a = 97;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans += (char)(a+sum+(s.charAt(i) - a));
            sum -= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = in.next();
        System.out.println("Enter the size of the array : ");
        int size = in.nextInt();
        int[] shift = new int[size];
        System.out.println("Enter the values of the shift array : ");
        for (int i = 0; i < size; i++) {
            shift[i] = in.nextInt();
        }
        System.out.println(shift(s,shift));
    }
}
