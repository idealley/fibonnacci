import java.util.*;
import java.math.*;


public class Fibo {

    static int index;

    public static void fib(){
        long t0 = System.nanoTime();

        int i;
        BigInteger n1, n2, n3;
        int key = 0;

    	if(index != 0){
            key = index -1 ;
        }
    	List<FibNum> numbers = new ArrayList<FibNum>(); 
    	for(i = 0; i <= key; i++ ){
    		if(i <= 1){
                n1 = BigInteger.valueOf(1);
    			numbers.add(new FibNum(i, n1));
    		} else {
    			n1 = numbers.get(i-1).value;
    			n2 = numbers.get(i-2).value;
                n3 = n1.add(n2);
    			numbers.add(new FibNum(i, n3));
    		}
    	}

        long t1 = System.nanoTime();

    	System.out.println(numbers.get(key).value + " Execution time: " + (t1-t0) + "ns");
    }

    public static void main(String  [] args) {
        index = 280000;
        Fibo.fib();
    }
}