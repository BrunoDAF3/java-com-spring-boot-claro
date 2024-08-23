import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta:");

        numeroConta = scanner.nextInt();

        System.out.println("Digite o numero da agencia:");

        agencia = scanner.next();

        System.out.println("Digite o nome do cliente:");

        nomeCliente = scanner.next();

        System.out.println("Digite o saldo:");

        saldo = scanner.nextDouble();

        String mensagem = "Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " je esta disponivel para saque";

        System.out.println(mensagem);

        scanner.close();

    }
}
