package ExemplosAula5;

import java.util.Scanner;

public class Exemplo3dw {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nota;
        do{
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = ler.nextInt();
        }
        while (nota<0 || nota>10);
    }
}
