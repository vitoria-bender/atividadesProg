package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor da base do triângulo: ");
        Float base = ler.nextFloat();
        System.out.print("Digite o valor da altura do triângulo: ");
        Float altura = ler.nextFloat();
        Float area = (base * altura)/2;
        System.out.printf("O valor da área do triângulo é de %.2f", area);
    }
}
