package ExerciciosAula5;

//Escreva um algoritmo para ler uma idade, mas o algoritmo deve aceitar somente idade válida,
// ou seja, o algoritmo deve “validar” a leitura da idade. Idade válida tem que ser maior que 0
// e menor que 150. Escrever a idade lida

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        do{
            System.out.println("Digite sua idade:  ");
            idade = ler.nextInt();
        }
        while(idade<0 || idade>=150);

        System.out.println("Sua idade é: "+idade);
    }
}
