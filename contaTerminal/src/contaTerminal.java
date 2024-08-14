import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número");
        String numero = scanner.next();

        System.out.println("Por favor, digite o seu nome !");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu saldo !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá" + nome.concat(" ") + ", obrigado por criar uma conta em nosso banco, sua agência é".concat(" ") + agencia.concat(" ") + ", conta".concat(" ") + numero.concat(" ") + "e seu saldo".concat(" ") + saldo + " " + "já está disponível para saque.".concat(" "));
    }
}
