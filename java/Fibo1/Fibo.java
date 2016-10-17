import java.util.*;

public class Fibo {

    static int index;

    public static void fib(){
        long t0 = System.nanoTime();

        int i;
        long n1, n2;
        int key = 0;

    	if(index != 0){
            key = index -1 ;
        }
    	List<FibNum> numbers = new ArrayList<FibNum>(); 
    	for(i = 0; i <= key; i++ ){
    		if(i <= 1){
    			numbers.add(new FibNum(i,1));
    		} else {
    			n1 = numbers.get(i-1).value;
    			n2 = numbers.get(i-2).value;
    			numbers.add(new FibNum(i, n2 + n1));
    		}
    	}

        long t1 = System.nanoTime();

    	System.out.println(numbers.get(key).value + "Execution time: " + (t1-t0) + "ns");
    }

    public static void main(String  [] args) {
        index = 90;
        Fibo.fib();
    }
}