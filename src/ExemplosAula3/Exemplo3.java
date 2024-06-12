package ExemplosAula3;

import java.util.Scanner;
public class Exemplo3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um número: ");
        float num = ler.nextFloat();

        if (num == 0){
            System.out.println("Seu número é zero\n");
        }
        else if (num < 0){
            System.out.println("Seu número é negativo\n");
        }
        else {
            System.out.println("Seu número é positivo\n");
        }
    }
}

