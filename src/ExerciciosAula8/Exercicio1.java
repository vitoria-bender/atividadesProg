package ExerciciosAula8;

import java.util.Random;
public class Exercicio1 {

    static int soma (int[] vetor){
        int soma = 0;
        for(int i=0; i<vetor.length;i++){
            soma+=vetor[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int [] vetor = new int[5];
        for(int i = 0; i<vetor.length; i++){
            vetor[i] = aleatorio.nextInt(0, 10);
            System.out.printf("%d ", vetor[i]);
        }
        System.out.printf("a soma dos valores do vetor é: %d", soma(vetor));
    }
}
