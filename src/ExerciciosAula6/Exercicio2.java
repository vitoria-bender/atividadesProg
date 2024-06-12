package ExerciciosAula6;

import java.util.Scanner;
//Declarar um vetor de até 100 números inteiros positivos, pedir para o usuário digitar elementos para o vetor,
// até que ele digite um 0 ou que o vetor esteja cheio, que encerra a leitura. Mostrar o vetor lido.
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[100];
        int num = 0;
        int cont = 0;

        do{
            System.out.println("Digite o "+num+ " número: " );
            num = ler.nextInt();
            vetor[cont] = num;
            cont++;
        }
        while(num!=0);

        for(num=0;num<cont;num++){
            System.out.print(vetor[num]+" ");
        }
    }
}
