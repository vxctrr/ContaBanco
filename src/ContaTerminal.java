import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.next();
        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.next();
        System.out.println("Digite seu saldo: ");
        double saldoConta = sc.nextDouble();
        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = sc.nextInt();

        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é: ")
                .concat(agencia)
                .concat(" e sua conta: ")
                .concat(String.valueOf(numeroConta))
                .concat(", seu saldo é de R$")
                .concat(String.valueOf(saldoConta))
                .concat(" e já está disponível para saque!");

        System.out.println(mensagem);
        sc.close();
    }
}