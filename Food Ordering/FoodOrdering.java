import java.util.Scanner;

public class FoodOrdering {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choose = 0;
        int count = 0;
        int price = 0;
        do {
            System.out.println("Choose the food you wish to buy"); //Displaying the user what foods are available
            System.out.println("1.Pizza = 200");
            System.out.println("2.Burger = 180");
            System.out.println("3.Briyani = 250");
            System.out.println("4.Dosa = 80");
            System.out.println("5.Idly = 50");
            System.out.println("6.Close the order");
            choose = in.nextInt();//getting th choice from the user
            switch (choose) { // switch to the case that user have opted for
                case 1:
                    System.out.println("Enter the Quantity : "); //getting the quantity
                    count = in.nextInt();
                    price += (count*200); // calculating the price
                    break;
                case 2:
                    System.out.println("Enter the Quantity : ");
                    count = in.nextInt();
                    price += (count*180);
                    break;
                case 3:
                    System.out.println("Enter the Quantity : ");
                    count = in.nextInt();
                    price += (count*250);
                    break;
                case 4:
                    System.out.println("Enter the Quantity : ");
                    count = in.nextInt();
                    price += (count*80);
                    break;
                case 5:
                    System.out.println("Enter the Quantity : ");
                    count = in.nextInt();
                    price += (count*50);
                    break;
                default:
                    break;
            }
        } while (choose != 6);
        System.out.println("The Amount Ordered : "+ price);
        if(price > 500){
            price -= (price*0.10);
            System.out.println("The Amount to be Paid : "+ price);
        }else{
            System.out.println("The Amount to be Paid : "+ price); // printing the Amount to be paid by the user for the order
        }
    }
}
