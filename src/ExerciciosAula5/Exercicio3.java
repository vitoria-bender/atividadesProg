package ExerciciosAula5;
//Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor lido não estiver
// entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após a leitura do valor, escrever
// o valor lido na tela.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;
        do{
            System.out.println("Digite um valor entre 1 e 10: ");
            valor = ler.nextInt();
        }
        while(valor<0 || valor>=10);

        System.out.println("O valor correto é: "+valor);
    }
}
