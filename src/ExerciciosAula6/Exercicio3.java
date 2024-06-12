package ExerciciosAula6;
//Ler um vetor de números, de 10 elementos. Declarar outro vetor inverso, copiar todos os elementos
// de números de trás para frente para o vetor inverso.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];


        for ( int i = 0; i < 10; i++) {
            System.out.println("Digite o " + i + " número: ");
            vetor1[i] = ler.nextInt();
        }

        int i2 = 9;

        for ( int i = 0; i < 10; i++){
            vetor2[i]=vetor1[i2]; //o vetor 2 recebe i e o vetor1 recebe i2 para mostrar ao contrário
            i2--;
        }

        for (int i=0;i<10;i++){
            System.out.print(vetor2[i]+" ");
        }
    }
}
