import java.util.*;
import java.math.*;


public class Fibo {
    public static int index = 280000;
    public static BigInteger[] n = new BigInteger[Fibo.index];

    public static void fib(){
        long t0 = System.nanoTime();
        int key = index > 0 ? index - 1 : 0;
        Fibo.n[0] = BigInteger.ONE;
        Fibo.n[1] = BigInteger.ONE;
        
    	for(int i = 0; i <= key; i++ ){
    		if(i > 1){
    			Fibo.n[i] = Fibo.n[i-1].add(Fibo.n[i-2]);
                Fibo.n[i-2] = null;
    		}
    	}

        long t1 = System.nanoTime();

    	System.out.println(Fibo.n[key] + " Execution time: " + (t1-t0) + "ns");
    }

    public static void main(String  [] args) {
        Fibo.fib();
    }
}