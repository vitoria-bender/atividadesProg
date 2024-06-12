package ExerciciosAula3;

import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        int produtos;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um código de produto: ");
        produtos = ler.nextInt();

        switch(produtos){
            case 1:
                System.out.println("O produto de código 1 é caderno.");
                break;
            case 2:
                System.out.println("O produto de código 2 é lápis.");
                break;
            case 3:
                System.out.println("O produto de código 3 é borracha.");
                break;
            default:
                System.out.println("Diversos.");
                break;


        }
    }
}
