import static java.lang.System.out;
import java.util.Scanner;


public class MultiplicationTableGrid {

     

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Welcome to Multiplication Tables");
        out.println("");
        out.println("How large would you like to see them?  ");
        int tableSize = keyboard.nextInt();
        
        out.println("");
        if (tableSize<=20) {
        printMultiplicationTable(tableSize);
    } else {
        out.println("Error, enter number less than 20");
    }
    }
     
    public static void printMultiplicationTable(int tableSize) {

        // first print the top header row

        out.printf("      ");

        for(int i = 0; i<=tableSize;i++ ) {

            out.printf("%4d",i);

        }

        System.out.println();

        

         

        for(int i = 0 ;i<=tableSize;i++) {

            // print left most column first

            out.printf("%4d     0",i);

            for(int j=1;j<=tableSize;j++) {

                out.printf("%4d",i*j);

            }

            System.out.println();

        }

    }

     

}