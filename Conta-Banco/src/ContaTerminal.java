import java.util.Locale;
import java.util.Scanner;
;public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {

        String nomeCliente = "";
        String agencia = "";
        int numero = 0;
        double saldo = 0.0;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor Digite o Numero da Conta: ");
        numero = scan.nextInt();

        System.out.println("Por favor Digite a Agencia: ");
        agencia = scan.next();

        System.out.println("Por favor Digite o Nome: ");
        nomeCliente = scan.next();

        System.out.println("Por favor Digite o Saldo da Conta: ");
        saldo = scan.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$"+saldo+" já está disponível para saque");


    }
}
