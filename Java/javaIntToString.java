/*You are given an integer N, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts N into a string S the code will print "Good job". Otherwise it will print "Wrong answer".
N can range between -100 to 100 inclusive.

Sample Input 0
100

Sample Output 0
Good job*/

import java.security.Permission;
import java.util.Scanner;

public class javaIntToString {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner leia = new Scanner(System.in);

            int n = leia.nextInt();
            leia.close();

            String s = Integer.toString(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }

        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }

    }

}

// The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
