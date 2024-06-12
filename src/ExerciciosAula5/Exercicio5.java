package ExerciciosAula5;

//Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcular e
// imprimir a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a
// leitura de cada nota (notas válidas: 0.0 a 10.0).

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float nota;
        float media = 0;
        for (int i = 1; i < 3; ) {
            System.out.print("Digite a nota " + i + ": ");
            nota = new Scanner(System.in).nextFloat();
            if (nota >= 0 && nota <= 10) {
                media += nota;
                i++;
            }
        }
        media /= 2;
        System.out.println("A média é " + media);

    }
}

