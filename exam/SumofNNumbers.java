import java.util.*;
public class SumofNNumbers {
    public static void main(String[] args) {
        Scanner reader =  new Scanner(System.in);
        System.out.println("How Many Elements you want to enter ? : ");

        int elements = reader.nextInt();
        reader.nextLine();
        int[] store10Numbers  = new int[elements];
        int sum = 0 ;


        for(int i=0 ; i < store10Numbers.length ; i++ )
        {
            System.out.println("enter next "+((store10Numbers.length)-i)+ " numbers :- ");
            boolean hasNextInt = reader.hasNextInt();
            if(hasNextInt){



                int numbers = reader.nextInt();
                reader.nextLine();
                store10Numbers[i] = numbers;
                sum += numbers ;
            }else{
                System.out.println("Invalid Number");
                // break;
            }
            // reader.nextLine();
        }
        reader.close();
        System.out.println(Arrays.toString(store10Numbers));
        System.out.println("The sum of the Number is "+sum);
    }
}
