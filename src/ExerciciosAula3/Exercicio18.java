package ExerciciosAula3;
//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever
// o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual
// a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
import java.util.Scanner;
public class Exercicio18 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o número da conta: ");
        int numConta = ler.nextInt();
        System.out.println("Informe seu saldo: ");
        float saldo = ler.nextFloat();
        System.out.println("Informe seu débito: ");
        float debito = ler.nextFloat();
        System.out.println("Informe seu crédito: ");
        float credito = ler.nextFloat();

        float saldoAtual = saldo - debito + credito;

        if(saldoAtual >= 0){
            System.out.println("Saldo positivo!");
        }
        else{
            System.out.println("Saldo negativo!");
        }
        System.out.printf("Seu saldo atual é de %.2f", saldoAtual);
    }
}

