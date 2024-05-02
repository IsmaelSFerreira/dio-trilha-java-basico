import java.util.Locale;
import java.util.Scanner;

public class ContaTermina {
    public static void main(String[] args) throws Exception {

        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        String nome = Scanner.nextLine();

        System.out.println("Digite o número da sua conta bancária: ");
        int numero = Scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = Scanner.next();

        System.out.println("Digite o saldo da sua conta bancária: ");
        double saldo = Scanner.nextDouble();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");


    }
}
