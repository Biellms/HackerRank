/*Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.

Given an input integer, you must determine which primitive data types are capable of properly storing that input.

Input Format:
The first line contains an integer, T, denoting the number of test cases.
Each test case, T, is comprised of a single line with an integer, n, which can be arbitrarily large or small.

Output Format:
For each input variable N and appropriate primitive dataType, you must determine if the given primitives are capable of storing it. 
If yes, then print: N can be fitted in: * dataType

Sample Input:
    5
    -150
    150000
    1500000000
    213333333333333333333333333333333333
    -100000000000000

Sample Output:
    -150 can be fitted in:
    * short
    * int
    * long
    150000 can be fitted in:
    * int
    * long
    1500000000 can be fitted in:
    * int
    * long
    213333333333333333333333333333333333 can't be fitted anywhere.
    -100000000000000 can be fitted in:
    * long
*/

import java.util.*;

public class javaDataTypes {

    static String valorDoNumero(String numero) {

        String resp = "";

        try {

            long num = Long.parseLong(numero);
            resp = numero + " can be fitted in:\n";
            
            if ((num <= Byte.MAX_VALUE) && (num >= Byte.MIN_VALUE)) {
                resp = resp.concat("* byte\n* short\n* int\n* long");
            } else if ((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)) {
                resp = resp.concat("* short\n* int\n* long");
            } else if ((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)) {
                resp = resp.concat("* int\n* long");
            } else {
                resp = resp.concat("* long");
            }

        } catch (NumberFormatException  e) {
            resp = numero + " can't be fitted anywhere.";
        }

        return resp;
    }

    public static void main(String []argh) {

        Scanner leia = new Scanner(System.in);
        int teste = leia.nextInt();

        leia.nextLine();

        for (int i = 0; i < teste; i++) {
            String numero = leia.nextLine();
            System.out.println(valorDoNumero(numero));
        }

        leia.close();

    }

}
