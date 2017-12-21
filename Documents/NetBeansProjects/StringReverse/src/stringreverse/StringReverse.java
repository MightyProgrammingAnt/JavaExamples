package stringreverse;
import java.util.Scanner;
/**
 *
 * @author sahni
 * Program takes in user input and reverses a string
 */
public class StringReverse {
    
    public static void menu(){
        System.out.println("Hello welcome to your phrase reversal tool: ");
        System.out.println("Please enter a phrase to be reversed");
        System.out.println("Do Not Include Spaces!!!!!");
    }
    
    public static void StringReverse(){
        String Original, Reverse = "";
        Scanner scan = new Scanner(System.in);
        Original = scan.nextLine();
        int length = Original.length();
        for (int i = length - 1; i >= 0; i--){
           Reverse = Reverse + Original.charAt(i);
           System.out.println(Reverse);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
        StringReverse();
    }
    
}
