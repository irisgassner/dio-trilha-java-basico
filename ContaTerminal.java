import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //pede o input dos dados para o usuario
        System.out.println("Por favor, digite o número da conta: "); 
        
        //registra os dados na variavel declarada
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        int conta = scanner.nextInt(); 

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        //printa a mensagem de texto concatecada aos dados inseridos pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , o numero de sua conta é " + conta + " , e seu saldo " + saldo + " já está disponivel para saque.");

    }
    
    
}
