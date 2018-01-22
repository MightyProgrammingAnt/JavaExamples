package datastructurespractise1;

/**
 *
 * @author sahni
 * Program Description: program prints the numbers from 1 to 100, 
 * but for multiples of 3 print “Fizz” instead of the number and for 
 * multiples of 5 print “Buzz”.  For numbers that are multiples of both 
 * and five print “FizzBuzz”.
 */
public class DataStructuresPractise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++)
        {      
            // variables that calculate modulus
            int three = i % 3;
            int five = i % 5;
            
            //All numbers are multiples of 1 prints "FizzBuzz" if i is position 1
            if (i == 1)
            {
                System.out.println("FizzBuzz");
                continue;
            }
            
            //i modulus 3 and 5 = 0 print "FizzBuzz"
            if (three == 0 && five == 0)
            {
                System.out.println("FizzBuzz");
                continue;
            }
            
            //i modulus 3 = 0 "Fizz"
            if (three == 0)
            {
                System.out.println("Fizz");
                continue;
            }
            
            //i modulus 5 = 0 "Buzz"
            else if (five == 0)
            {
                System.out.println("Buzz");
                continue;
            }
            
            //if all other statements are false print position of i to screen.
            System.out.println(i);
            
        }
    }
    
}
