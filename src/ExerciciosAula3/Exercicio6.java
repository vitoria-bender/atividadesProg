package ExerciciosAula3;

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float num1 = ler.nextFloat();
        System.out.println("Digite o segundo número: ");
        float num2 = ler.nextFloat();

        if(num1 > num2){
            System.out.println("o primeiro número é maior\n");
        }
        else if(num2 > num1){
            System.out.println("O segundo número é maior que o primeiro\n");
        }
        else{
            System.out.println("os valores digitados são iguais\n");
        }
    }
}

