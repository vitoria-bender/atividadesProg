package ExerciciosAula8;

//Crie um método que receba 3 números e retorne o menor valor.

import java.util.Scanner;
public class Exercicio3 {

    static int menor(int n1, int n2, int n3) {
        int menorNum =0;
        if(n1<n2 && n1<n3){
             menorNum = n1;
        }
        else if(n2<n1 && n2<n3){
            menorNum = n2;
        }
        else{
            menorNum = n3;
        }
        return menorNum;
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float menorN;
        System.out.println("Digite o primeiro número: ");
        float num1 = ler.nextFloat();
        System.out.println("Digite o segundo número: ");
        float num2 = ler.nextFloat();
        System.out.println("Digite o terceiro número: ");
        float num3 = ler.nextFloat();

        if(num1<num2 && num1<num3){
             menorN = num1;
        }
        else if(num2<num1 && num2<num3){
            menorN = num2;
        }
        else{
            menorN = num3;
        }

        System.out.printf("o menor número é: %d", menorN);
    }



}