import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Conta :");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência :");
        String agencia = scanner.next();
        System.out.println("Usuário: " + agencia);

        System.out.println("Nome do cliente : ");
        String cliente = scanner.next();

        System.out.println("Seu Saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +  " e seu saldo " + saldo + " já está disponível para saque");



       
    }
    


    

}
