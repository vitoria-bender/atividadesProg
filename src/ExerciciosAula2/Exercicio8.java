package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args){
        Scanner ler =  new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        Float fah = ler.nextFloat();
        Float temp = 5*(fah-32)/9;
        System.out.printf("A temperatura %.2f fahrenheit é" +
                " equivalente a %.2f celsius", fah, temp);
    }
}
