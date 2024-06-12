package ExerciciosAula5;
//Escreva um algoritmo para pedir que o usuário digite números positivos, ou seja, ele pode
// digitar quantos números positivos ele quiser. Para parar de digitar números, ele deve
// digitar -1. Após o usuário digitar -1, o programa deve escrever na tela quantos números
// o usuário digitou (a quantidade de números lidos) e a soma total dos números que ele digitou.

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        int num;
        float conta = 1;
        int contagem = -1;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("Digite números positivos: ");
            num = ler.nextInt();
            conta += num;
            contagem++;
        }
        while(num!=-1);
        System.out.println("A soma dos números digitados é: "+conta);
        System.out.println("foram digitados "+contagem+ "numeros");

    }
}
