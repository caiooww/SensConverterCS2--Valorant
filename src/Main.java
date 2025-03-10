import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.println("Digite Sua Sensibilidade de Counter Strike 2:");
            double sens = sc.nextDouble();
            double sensCS2 = sens / 3.181818;
            double sensOW = sens / 10.6;
            System.out.printf("Sua sensibilidade do CS2 convertida para o Valorant é: %.4f%n", sensCS2);
            System.out.println("Deseja repetir? (S/N)");

        resp = sc.next().charAt(0);
       } while (resp != 'n');
        sc.close();

    }
}