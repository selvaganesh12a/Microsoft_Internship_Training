import java.util.Scanner;
class TicketBooking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int ticket = 0;
        int choose = 0;
        int price = 0;
        do {
            System.out.println("Choose the option below"); //Displaying the user what category of tickets are available
            System.out.println("1. Age is greater than 12 and less than 60");
            System.out.println("2. Age is less than 12");
            System.out.println("3. Age is greater than 60");
            System.out.println("4. Exit");
            choose = in.nextInt(); //getting th choice from the user
            switch (choose) { // switch to the case that user have opted for
                case 1:
                    System.out.println("Enter the Number of Tickets : "); //getting the number of tickets
                    count = in.nextInt();
                    ticket += count;
                    price += (count*50); // calculating the price
                    break;
                case 2:
                    System.out.println("Enter the Number of Tickets : ");
                    count = in.nextInt();
                    ticket += count;
                    price += (count*20);
                    break;
                case 3:
                    System.out.println("Enter the Number of Tickets : ");
                    count = in.nextInt();
                    ticket += count;
                    price += (count*30);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter a Valid Input");
            }    
        } while (choose != 4);
        in.close();
        System.out.println("The Number of tickets booked : "+ ticket);// printing the number of tickets
        System.out.println("The Price of Ticket : "+price); 
    }
}