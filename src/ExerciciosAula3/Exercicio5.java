package ExerciciosAula3;

//Crie um programa que teste se o valor que usuário digitou está entre 10 e 15 e exibe alguma mensagem na tela.
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Adivinhe o valor: ");
        float valor = ler.nextFloat();

        if(valor>=10 && valor<=15){
            System.out.println("Você acertou!\n");
        }
        else {
            System.out.println("Você errou!\n");
        }
    }
}
