import java.util.Arrays;

public class SingleInheritance {
    SingleInheritance(){
        System.out.println("parent "+getClass()+"'s constructor called");
    }
    public int a = 100;
    class InheritedClass extends SingleInheritance{
        /*single inheritance using innerclass
        here the innerclass inherits the SingleInheritance class ..
        */

        InheritedClass(){
            System.out.println("inherited class"+getClass()+"constructor called");
        }


    }

    public static void main(String[] args) {
        SingleInheritance parent = new SingleInheritance();
        SingleInheritance.InheritedClass child = parent.new InheritedClass();
        System.out.print("accessing parent class variable 'a' through childclass "+child.a);


    }
}
