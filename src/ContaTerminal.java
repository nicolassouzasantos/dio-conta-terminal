import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite o número da sua agência: ");
        String numeroAgencia = scanner.next();
        
        System.out.println("Digite seu saldo: ");
        double saldoCliente = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldoCliente);

        scanner.close();
    }
}
