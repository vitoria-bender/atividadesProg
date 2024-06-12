package ExemplosAula6;

//EXEMPLOS VETORES
import java.util.Scanner;
public class Exemplo2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //vetor de 20 num int com indices de 0 a 19;
        int[] lista = new int[20];

        System.out.println("O tamanho da lista é "+lista.length);

        for (int i = 0; i<lista.length; i++) {
            System.out.println("Digite um número para a lista[" + i + "]: ");
            lista[i] = ler.nextInt();
        }
        System.out.println("Dados no vetor: ");
        for(int i=0;i<lista.length;i++){
            System.out.print(lista[i]+" ");
        }
    }
}