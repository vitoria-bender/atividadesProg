package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Quantos metros você quer converter para centímetros?: ");
        Float metro = ler.nextFloat();
        Float centimetro = metro * 100;
        System.out.printf("%.2f metros equivale a %.2f centimetros.\n", metro, centimetro);
    }
}
