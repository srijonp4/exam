import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.sql.SQLOutput;


public class UseStatic  {
    public static String name;
    public static void main(String[] args) throws IOException {
        display();

    }
    public static void display() throws IOException{
        System.out.println("enter your name:");
        name= (new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("your name is "+name);


    }
    static{
        System.out.println("static block executed");
    }
}
