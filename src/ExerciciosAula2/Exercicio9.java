package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        Float num1 = ler.nextFloat();
        System.out.print("Digite o segundo número: ");
        Float num2 = ler.nextFloat();
        Float soma = num1 + num2;
        Float mult = num1 * num2;
        System.out.printf("A soma dos número é %.2f e a" +
                " multiplicação destes é %.2f", soma, mult);
    }
}
