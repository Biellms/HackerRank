import java.util.*;

public class javaStringIntroduction {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        // String A = "hello";
        // String B = "java";

        String A = leia.next();
        String B = leia.next();

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        A = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();;
        B = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();;

        System.out.println(A + " " + B);

        leia.close();
    }
}
