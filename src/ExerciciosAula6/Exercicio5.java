package ExerciciosAula6;

//Declarar um vetor números com 20 elementos, gerar valores inteiros para ele aleatoriamente.
// Declare outros dois vetores, par e impar. No vetor par armazenar todos os elementos pares
// do vetor números. No vetor ímpar armazenar todos os elementos ímpares de números.
// Imprima os dois vetores.

import java.util.Random;

public class Exercicio5 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int ci = 0;
        int cp = 0;
        int[] vetor = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];

        for(int i=0; i<vetor.length;i++){
            vetor[i] = aleatorio.nextInt(20);
            //System.out.print(vetor[i]+" ");
            if(vetor[i]%2 ==0){
                par[cp] = vetor[i];
                cp++;
            }
            else{
                impar[ci] = vetor[i];
                ci++;
            }
        }

        System.out.println("Os seguintes são");
        for(int i=0;i<cp;i++){
            System.out.println(par[i]+" ");
        }
    }


}
