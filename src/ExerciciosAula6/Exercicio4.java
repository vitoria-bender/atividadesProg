package ExerciciosAula6;

import java.util.Scanner;
//Ler um vetor A de 10 elementos inteiros e um valor X também inteiro. Armazenar em um vetor M
// o resultado de cada elemento de A multiplicado pelo valor X. Logo após, imprimir o vetor M.

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] vetor2 = new int[10];

        for (int i=0;i<vetor.length;i++){
            System.out.println("Digite o "+i+ " número: " );
            vetor[i] = ler.nextInt();
        }
        System.out.println("Digite um número para descobrir a multiplicação: ");
        int num = ler.nextInt();

        for(int i=0;i<10;i++){
            vetor2[i] = vetor[i]*num;
            System.out.print(vetor2[i]+" ");
       }


    }
}
