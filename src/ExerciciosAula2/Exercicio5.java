package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio5 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o raio do círculo que você quer calcular a área: ");
        Float raio = ler.nextFloat();
        Double area = raio*raio*3.14;
        System.out.printf("A área do círculo é: %.2f", area);
    }

}
