package ExerciciosAula3;
//Receba três valores fornecidos pelo usuário que representarão os lados de um triângulo.
//Verifique se os valores formam um triângulo e classifique esse triângulo como:
//a) Equilátero: três lados iguais.
//b) Isósceles: dois lados iguais.
//c) Escaleno: três lados diferentes. Lembre-se de que, para formar um triângulo, nenhum dos lados pode ser
// igual a zero, um lado não pode ser maior do que a soma dos outros dois.

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado: ");
        double lado1 = ler.nextDouble();
        System.out.println("Digite o valor do segundo lado: ");
        double lado2 = ler.nextDouble();
        System.out.println("Digite o valor do terceiro lado: ");
        double lado3 = ler.nextDouble();

        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("O triângulo é equilátero.");
        }
        else if (lado1 == lado2 && lado2 != lado3){
            System.out.println("O triângulo é isósceles.");
        }
        else if (!(lado1 == lado2 || lado2 == lado3 || lado1 == lado3));{
            System.out.println("O triângulo é escaleno.");
        }

        }
    }

