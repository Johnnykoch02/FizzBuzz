// Based on a traditional English children's game
// Print the numbers 1..100
// For multiples of 3, print "Fizz" instead of the number
// For multiples of 5, print "Buzz" instead of the number
// For multiples of 3 and 5, print "FizzBuzz" instead of the number
// Here: fill an array instead of printing + some other complications

public class main {
    static String[] fb = new String[101];

    public static void main(String[] args) {
       
        for(int i = 1; i < fb.length; i++) {
            if(i%3 == 0 && i%5 == 0)
            {
                fb[i] = "FizzBuzz";
            }                
            else if(i%3 == 0 && (i%5 != 0))
            {
                fb[i] = "Fizz";
            }
            else if(i%3 != 0 && i%5 == 0)
            {
                fb[i] = "Buzz";
            }
            else {
                fb[i] = ("" + i);
            }
            System.out.println(fb[i]);
        }
    }

}