package ExerciciosAula3;
//A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas
// receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo
// que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
// que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe qual o valor/hora que você ganha: ");
        float valor = ler.nextFloat();
        System.out.println("Informe quantas horas você trabalhou no mês: ");
        float horas = ler.nextFloat();

        valor=valor*horas;

        if(horas > 160){
            //float salarioExtra = horas-160*(valorHora*(float)1.5);
            // float salario = salarioBase + salarioExtra;
            float mes = horas - 160;
            float valorExtra = valor+(valor/2);
            float salario = (mes*valorExtra)+valor;
        }
        System.out.printf("Seu salário mensal é de R$%.2f", valor);
    }
}
