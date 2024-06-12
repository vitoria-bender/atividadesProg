package ExemplosAula8;

import java.util.Scanner;

public class Exemplo1metodo {
    static int soma(int v1, int v2){
    int resp = v1 + v2;
    return resp;
}
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = ler.nextInt();
        System.out.println("digite outro número: ");
        int n2 = ler.nextInt();
        int soma = n1 + n2;
        System.out.printf("a soma é %d", soma);
    }
}
