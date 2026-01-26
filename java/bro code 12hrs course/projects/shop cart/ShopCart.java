import java.util.Scanner;

public class ShopCart {
    
    public static void main(String[] args) {
        // Shopping cart program 
        Scanner scanner = new Scanner(System.in);

        String item ;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("what item would you like to buy ? :");
        item = scanner.nextLine();

        System.out.print("What is the price for each ?:");
        price = scanner.nextDouble();

        System.out.print("How maney would you like ?:");
        quantity = scanner.nextInt();


        total = price * quantity;
        System.out.println( "\n You have brought " + quantity + "  " + item + "/s");
        System.out.println(" Your total is " + currency + total );

        scanner.close();
    }
}

/*   what item would you like to buy ? :pizza
What is the price for each ?: 8
How maney would you like ?:9

 You have brought 9  pizza/s
 Your total is $72.0         */