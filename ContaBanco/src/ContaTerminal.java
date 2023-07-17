import java.util.Scanner;
import java.util.InputMismatchException;


public class ContaTerminal {
    public static void main(String[] args) throws InputMismatchException {
        //ToDo: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
            
        // Exibir as mensagens para nosso usuário
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;
      
        //Obter pela scanner os valores digitados no terminal
                //atribuindo a agencia variavel, com o preenchimento pelo usuário
        System.out.println("Digite o numero da sua agência: ");
        agencia = sc.next();
                //atribuindo numero da conta a variavel, com o preenchimento pelo usuário

        System.out.println("Digite o numero da sua conta bancária: ");
        numeroConta = sc.nextInt();

                //atribuindo o nome a variavel, com o preenchimento pelo usuário
        System.out.println("Digite seu nome completo: ");
        nomeCliente = sc.next();
                //atribuindo o saldo a variavel, com o preenchimento pelo usuário
        System.out.println("Digite seu saldo: ");
                    //realizamos o input como String, usamos o Float.parseFloat, para converter String em Float, e não quebrar o programa
        saldo = Float.parseFloat(sc.next());

        //Exibir a mensagem conta criada, em format, agregando todas variáveis com informações preenchidas pelo usuário.

        System.out.format("Olá %s! Obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo R$%.2f já está disponível para saque.",
        nomeCliente,
        agencia,
        numeroConta,
        saldo
        );

        sc.close();
    }
}
