import java.util.*;
import java.math.*;


public class Fibo {
    public static int index = 10000000;
    public static BigInteger[] n = new BigInteger[2];

    public static void fib(){
        long t0 = System.nanoTime();
        int key = index > 0 ? index - 1 : 0;
        int next = 0;
        Fibo.n[0] = BigInteger.ONE;
        Fibo.n[1] = BigInteger.ONE;
        
    	for(int i = 1; i <= key; i++ ){
            Fibo.n[next] = Fibo.n[0].add(Fibo.n[1]);
            next++;
            next = next % Fibo.n.length;
    	}

        long t1 = System.nanoTime();

    	System.out.println(Fibo.n[next] + " Execution time: " + (t1-t0) + "ns");
    }

    public static void main(String  [] args) {
        Fibo.fib();
    }
}