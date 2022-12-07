import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner ReadNumber = new Scanner(System.in);
        System.out.print("Insert The number to Check: ");
        int number = ReadNumber.nextInt();
        String Checker = (number %2 == 0 )? "Even" : "odd" ;
        System.out.println(number + " is a " + Checker + " number🔢" );


        
    }
}
class HelloGnit {
    public static void main(String[] args){

        System.out.println("Hello👋 Gnit");
    }

}