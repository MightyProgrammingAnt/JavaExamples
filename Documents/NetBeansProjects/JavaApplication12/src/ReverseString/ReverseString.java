package ReverseString;

/**
 *
 * @author sahni
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word = "Hello";
        String rev = " ";
        int length = word.length();
        
        for (int i = length - 1; i >= 0; i--)
        {
            rev = rev + word.charAt(i);
        }
        System.out.print(rev);
    }
    
}
