package ExemplosAula6;

//EXEMPLOS VETORES
import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //vetor de 10 num int com indices de 0 a 9;
        int[] lista = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número para a lista[" + i + "]: ");
            lista[i] = ler.nextInt();
        }
        System.out.println("Dados no vetor: ");
        for(int i=0;i<10;i++){
            System.out.println(lista[i]+" ");
        }
    }
}
