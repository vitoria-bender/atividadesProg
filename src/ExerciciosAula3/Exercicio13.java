package ExerciciosAula3;
//Criar um programa para identificar o valor a ser pago por um plano de saúde dada a idade do conveniado
// considerando que todos pagam R$ 100 mais um adicional conforme os seguintes dados:
//a) crianças com menos de 10 anos pagam R$80;
//b) conveniados com idade entre 10 e 30 anos pagam R$50;
//c) conveniados com idade entre 40 e 60 anos pagam R$ 95;
//d) conveniados com mais de 60 anos pagam R$130.
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valorBase = 100;
        System.out.println("Informe a idade do conveniado: ");
        int idade = ler.nextInt();

       if(idade < 0){
           System.out.println("Idade inválida!");
       }
       else if(idade < 10){
            valorBase += 80;
            System.out.printf("O conveniado paga R$%d", valorBase);
        }
        else if(idade >= 10 && idade<=30){
            valorBase += 50;
            System.out.printf("O conveniado paga R$%d", valorBase);
        }
        else if(idade > 30 && idade <=60){
            valorBase += 95;
            System.out.printf("O conveniado paga R$%d", valorBase);
        }
        else{
            valorBase += 130;
           System.out.printf("O conveniado paga R$%d", valorBase);
       }
    }
}
