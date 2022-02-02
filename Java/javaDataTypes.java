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
