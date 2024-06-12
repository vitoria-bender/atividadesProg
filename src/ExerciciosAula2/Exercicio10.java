package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor do lado do quadrado: ");
        Float lado = ler.nextFloat();
        Float area = lado * lado;
        Float perimetro = lado+lado+lado+lado;
        System.out.printf("A área do quadrado é de %.2f e o perímetro do quadrado é %.2f", area, perimetro);
    }
}
