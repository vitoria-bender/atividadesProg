package ExemplosAula3;

import java.util.Scanner;
public class Exemplo6suitcase {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 7: ");
        int dia = ler.nextInt();
        switch(dia){
            case 1, 7 -> System.out.println("É fim de semana");
            case 2, 3, 4, 5, 6 -> {
                System.out.println("É dia útil");
                System.out.println("pode ter mais de um comando");
            }
            default -> System.out.println("Número inválido");
        }

    }
}
