import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            count++;
        } while (count < 5);
    }
}
