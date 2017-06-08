
package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("---Fibonacci---");
        System.out.println("6.Fibonacci Number:"+fibon(6));
        System.out.println("25.Fibonacci Number:"+fibon(25));
    }

    private static int fibon(int i) {
        if (i<=1) {
            return i;
        }
        else
            return fibon(i-1)+fibon(i-2);    
    }
    
}
