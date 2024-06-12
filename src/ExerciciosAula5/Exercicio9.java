package ExerciciosAula5;

import java.util.Scanner;
//Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 1;
        int inicio = 100;
        do{
            inicio+=i;
              i++;
        }
        while(i<10);
        System.out.println(+inicio);
    }
}
