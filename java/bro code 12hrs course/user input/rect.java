
import java.util.Scanner;


public class rect {
         public static void main(String[] args) {
             // constructing rectangle

             double width = 0;
             double height = 0;
             double area = 0;

             Scanner scanner = new Scanner(System.in);
            
             System.out.print("Enter the width : ");
             width =scanner.nextDouble();


            System.out.print("Enter the height : ");
             height =scanner.nextDouble();

            area = width * height;

            System.out.println("The area of the rectangel " + area + "cm²");

             scanner.close();
         }           
}
/*  
expected output 
Enter the width : 8.4
Enter the height : 3.453
The area of the rectangel 29.0052cm²
*/