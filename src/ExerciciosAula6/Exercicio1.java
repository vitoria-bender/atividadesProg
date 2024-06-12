package ExerciciosAula6;

//1 - Ler dois vetores, A e B com um número variável de conteúdo (números) (no máximo 10). O programa
// deve solicitar antes da leitura dos vetores a quantidade de dados a serem lidos (1 a 10), os dois
// vetores terão o mesmo número de elementos. Gerar um terceiro vetor chamado Soma (de no máximo 10 elementos)
// que seja a soma dos dados do vetor A com os do vetor B.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor (máximo 10): ");
        int t = ler.nextInt();

        int[] vetorA = new int[t];
        int[] vetorB = new int[t];
        int[] vetorSoma = new int[t];

        for(int i=0;i<vetorA.length;i++){
            System.out.println("Digite o "+i+ " número: " );
            vetorA[i] = ler.nextInt();
        }
        for(int i=0; i<vetorB.length;i++) {
            System.out.println("Digite o " + i + " número: ");
            vetorB[i] = ler.nextInt();
        }
        for(int i=0; i< vetorSoma.length;i++){
            vetorSoma[i] = vetorA[i] + vetorB[i];
            System.out.println("O conteúdo do vetor soma é: " +vetorSoma[i]+ ".");
        }
    }
}
