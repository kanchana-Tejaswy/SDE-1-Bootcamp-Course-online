import java.util.Scanner;

public class age {
    public static void main(String[] args) {
       // if statement = perform a block of code if its condition is true 
       Scanner scanner = new Scanner(System.in);
        int age ;
        System.out.print("Enter your age : ");
        age = scanner.nextInt();

        if(age >= 65 ){
            System.out.println(" you are senior ");
        }
        else if(age >= 18){
            System.out.println("you are an audult ");
        }
        else if(age  < 0 ) {
            System.out.println("You haven't born yet !");
        }
        else if(age == 0) {
            System.out.println("you are baby");
        }
        else{
            System.out.println("you are a child !");
        }
    }
}
