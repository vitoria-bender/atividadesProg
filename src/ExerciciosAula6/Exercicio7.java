package ExerciciosAula6;
// Ler um vetor que contenha as notas de uma turma de 10 alunos. Calcular a média da turma e contar
// quantos alunos obtiveram nota acima desta média calculada. Escrever a média da turma e o resultado da contagem
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float[] vetor = new float[10];
        float nota=0;
        float soma=0;
        float media=0;



        for(int i=0; i<vetor.length;i++){
            System.out.println("Digite a nota do aluno: ");
            vetor[i] = ler.nextFloat();
        }

        for(int i=0; i<vetor.length;i++){
           soma = soma + vetor[i];
        }

        media = soma/10;
        System.out.print(media);

        int t = ler.nextInt();
        float[] vetorMedia = new float[t];

        for(int i=0; i<vetor.length;i++){

            if(vetor[i]>media){
                vetorMedia[i] = ler.nextFloat();
                System.out.println(vetorMedia[i]+"alunos têm nota acima da média.");

            }
        }
    }
}
