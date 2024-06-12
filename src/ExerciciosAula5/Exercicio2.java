package ExerciciosAula5;

//Escreva um algoritmo que leia 10 valores e conte quantos deles estão no intervalo entre 10 e 20.
// Depois escreva essa informação.

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float num;
        int i = 1;
        do {
            System.out.print("Digite o número " + i + ": ");
            i++;
            num = ler.nextFloat();
        }
        while(i<=10 && i>=1);

        if(num>=10 && num<=20){
            System.out.print("Os números entre 10 e 20 são: " +i);
        }
    }
}
