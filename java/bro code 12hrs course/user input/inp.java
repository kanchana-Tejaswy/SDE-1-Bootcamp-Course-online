
import java.util.Scanner;


public class inp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("enter your age: ");
        int age = scanner.nextInt();
        System.out.println(" Are you enjoying the course? (true/false): ");
        boolean isEnjoying = scanner.nextBoolean();


        System.out.println( "hello " + name +"\n"+"you are " + age + " years old");
        System.out.println("Enjoying the course: " + isEnjoying);

        if (isEnjoying) {
            System.out.println("Great to hear that you're enjoying the course!");
        } else {
            System.out.println("Sorry to hear that. Hope it gets better!");
        }
        scanner.close();
    }
    
}

/*
Enter your name: teja
enter your age: 7
 Are you enjoying the course? (true/false): 
true
hello teja
you are 7 years old
Enjoying the course: true 
Great to hear that you're enjoying the course!
*/