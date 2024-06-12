package ExerciciosAula3;
//Escreva um programa em Java que recebe um inteiro e diga se é par ou ímpar.
// Use o operador matemático % (resto da divisão ou módulo) e o teste condicional if
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = ler.nextInt();
        if(num%2 == 0){
            System.out.println("O número é par\n");
        }
        else{
            System.out.println("O número é ímpar\n");
        }
    }
}
