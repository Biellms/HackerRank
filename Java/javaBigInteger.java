import java.util.*;
import java.math.*;

public class javaBigInteger {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        BigInteger a = leia.nextBigInteger();
        BigInteger b = leia.nextBigInteger();
        
        BigInteger c, d;
        
        c = a.add(b);
        d = a.multiply(b);
        
        System.out.println(c);
        System.out.println(d);
        
        leia.close();
        
    }
}
