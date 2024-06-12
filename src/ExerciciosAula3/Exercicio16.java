package ExerciciosAula3;

//Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima
// em estoque de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima +
// quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem
// 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.

import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade mínima em estoque: ");
        float min = ler.nextFloat();
        System.out.println("Informe a quantidade máxima em estoque: ");
        float max = ler.nextFloat();
        System.out.println("Informe a quantidade atual em estoque: ");
        float atual = ler.nextFloat();

        float media = (max + min)/2;
        if(atual >=  media){
            System.out.println("Não efetuar compra.");
        }
        else{
            System.out.println("Efetuar compra.");
        }
    }
}
