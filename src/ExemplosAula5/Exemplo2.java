package ExemplosAula5;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        int nota = ler.nextInt();
        while(nota<0 || nota>10){
            System.out.println("Nota inválida. Digite outra: ");
            nota = ler.nextInt();
        }
    }
}
