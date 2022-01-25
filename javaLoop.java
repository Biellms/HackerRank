/*Task:
Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.
Input Format:
 A single integer, N.
Constraints:
2 <= N <= 20
Output Format:
Print 10 lines of output; each line i (where 1 <= I <= 10) contains the result of N x i in the form: N x i = result.*/

import java.util.Scanner;

public class javaLoop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            int N = 2;
        
            for(int i = 1; i <= 10; i++){
                System.out.println(N + " x " + i + " = " + N*i);
            }
            
            scanner.close();
    }
}
