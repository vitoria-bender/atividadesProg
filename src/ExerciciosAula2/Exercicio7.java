package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu peso em kg: ");
        Float peso = ler.nextFloat();
        System.out.print("Digite sua altura em m: ");
        Float altura = ler.nextFloat();
        Float imc = peso/(altura * altura);
        System.out.printf("Seu IMC é de: %.2f", imc);
    }
}
