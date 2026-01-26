
public class ifStat {
    public static void main(String[] args) {
       // if statement = perform a block of code if its condition is true 
       
        int age = -1;
        if(age >= 18){
            System.out.println("you are an audult ");
        }
        else if(age  < 0 ) {
            System.out.println("You haven't born yet !");
        }
        else{
            System.out.println("you are a child !");
        }
    }
}
