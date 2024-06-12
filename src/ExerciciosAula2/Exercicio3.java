package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        Float nota1 = ler.nextFloat();
        System.out.print("Digite a nota 2: ");
        Float nota2 = ler.nextFloat();
        System.out.print("Digite a nota 3: ");
        Float nota3 = ler.nextFloat();
        System.out.print("Digite a nota 4: ");
        Float nota4 = ler.nextFloat();
        Float media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.printf("A média das notas é de: %.2f", media);

    }
}
