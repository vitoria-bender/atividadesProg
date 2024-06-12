package ExerciciosAula3;
//A calculadora de Luciana pifou, justo quando ela precisa fazer vários cálculos. Ela tem um computador,
// mas não sabe que um dos acessórios do Windows é uma calculadora. Sendo estudante de programação,
// Luciana resolveu fazer um programa. A especificação que bolou prevê que programa leia dois números inteiros
// (o que atende suas necessidades) e em seguida um símbolo de operação. Se este for '+', o programa soma os números,
// se '-', subtrai, se '*' multiplica e se '/' divide. Se o símbolo for diferente desses, é mostrada uma mensagem
// de erro. O programa, antes de dividir, critica se o divisor é zero e mostra uma mensagem de erro.
// Implemente um programa que construa essa calculadora para Luciana.

import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float num1 = ler.nextFloat();
        System.out.println("Digite o segundo número: ");
        float num2 = ler.nextFloat();
        System.out.println("Digite a operação que deseja realizar entre estes números: + - * /");
        float op = ler.nextFloat();

        if (op == '+') {
            float calc = num1 + num2;
            System.out.printf("O resultado é %.2f", calc);
        }
        else if(op == '-'){
            float calc = num1 - num2;
            System.out.printf("O resultado é %.2f", calc);
        }
        else if(op == '*'){
            float calc = num1 * num2;
            System.out.printf("O resultado é %.2f", calc);
        }
        else if(op == '/'){
            float calc = num1 / num2;
            System.out.printf("O resultado é %.2f", calc);
        }
        else{
            System.out.println("Símbolo inválido!");
        }

    }
}
