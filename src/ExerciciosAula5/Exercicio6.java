package ExerciciosAula5;

//Escreva um algoritmo que leia três notas de um aluno e calcule sua média. Ao final do algoritmo
// pergunte se deseja efetuar o cálculo para mais algum aluno. Se o usuário receber digitar S,
// leia novamente as três notas até que o usuário responda não.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char resp = 0;
        do{
            System.out.println("Digite a nota 1 do aluno: ");
            float num1 =ler.nextFloat();
            System.out.println("Digite a nota 2 do aluno: ");
            float num2 =ler.nextFloat();
            System.out.println("Digite a nota 1 do aluno: ");
            float num3 =ler.nextFloat();

            float media= (num1+num2+num3)/3;

        }
        while(resp== 's');

    }
}
