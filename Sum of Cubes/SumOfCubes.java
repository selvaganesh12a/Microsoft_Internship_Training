import java.util.Scanner;//importing the Scanner class
class SumOfCubes{
    static int sumCubes(int m, int n){
        int sum = 0;
        if(m > n){     // checking whether m > n if so returning 0
            return 0;
        }else{ //else calculating the sum of cubes between M to N
            for (int i = m; i <= n ; i++) { // travrsing from M to N using for Loop
                sum += (i*i*i); // addition of the cubes 
            }
            return sum; //return the answer
        }  
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of M : ");
        int m = in.nextInt();
        System.out.println("Enter the value of N : ");
        int n = in.nextInt();
        System.out.println(sumCubes(m,n));//function calling to get answer
    }
}