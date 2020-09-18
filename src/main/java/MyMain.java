import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {      // I'm having trouble solving this one. I even tried collaborating with a friend but we still couldn't figure it out.
        int r = Math.max(a,b);
        int e = Math.max(b,c);
        int y = Math.max(a,c);
        
        if (r != b && e == b) {
            return b;
        }
        if (r == b && e != b) {
            return b;

        }
        if (e != c && y == c) {
            return c;
        
        }
        if (e == c && f != c) {
            return c;

        }
        else {
            return a;
        
        }
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int r = Math.abs(a);
        int e = Math.abs(b);
        int y = Math.max(c,d);
        if(e == d){
            return b;
        }
        else {
            return a;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double x = Math.pow(a, 2);
        double y = Math.pow(b,2);
        double c = (x + y);
        double z = Math.sqrt(c);
        return z;
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        // YOUR CODE HERE
    }
}
