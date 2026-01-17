public class vaariable {
    public static void main(String[] args) {
        
       



/* 

Variable = a reussable container for a value 
           a varaible behave as if it was the value it contains 

Primitive = Simple value stored directly in money(stack)
Referance = money address (stack) that points to the ( heap)

Primitive         vs    Referance 

int = 432                    String = "Hello"
double = 3.14                array = [1, 2, 3]
char = 'A'                   object = new Object()
boolean = true               class = new MyClass()


2 Steps to creating a variable 

1. Declare a variable 
   specify the type and name 

   ex: int age; 
       String name;

2. Assign a value to the variable
   use the assignment operator =    



*/

 // 1. Declare a variable 
        int age; 
        int year;
         
        // 2. Assign a value to the variable
        age = 25;
        year = 2007;

        // print the variable 
        System.out.println("the year is:   " + year);
        System.out.println("Age: " + age);

        // you can also declare and assign in one line 
        double gpa = 3.5;
        System.out.println("GPA: " + gpa);
    }
}