import java.util.*;

public class javaEndOfFile {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        String n;

        for (int i = 1; i <= 3; i++) {
            n = leia.nextLine();
            System.out.printf("%d %s\n", i, n);
        }

        leia.close();
    }
}