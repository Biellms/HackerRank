import java.util.*;

public class javaEndOfFile {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int linha = 1;

		while (true) {
			String line = leia.nextLine();
			System.out.println(linha + " " + line);
			linha++;
                if (!leia.hasNext()) {
                    break;
                }
		}

		leia.close();
	}
}