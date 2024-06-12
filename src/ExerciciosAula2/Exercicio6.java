package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args){
        Scanner ler =  new Scanner(System.in);
        System.out.print("Digite quanto você ganha por hora: ");
        Float hora = ler.nextFloat();
        System.out.print("Digite quantas horas você trabalha no mês: ");
        Float mes = ler.nextFloat();
        Float salario = hora * mes;
        System.out.printf("Seu salário mensal é de: R$ %.2f", salario);
    }
}
