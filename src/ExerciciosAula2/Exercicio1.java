package ExerciciosAula2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        Float num = ler.nextFloat();
        System.out.printf("O número digitado foi %.2f", num);
    }
}
