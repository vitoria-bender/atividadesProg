package ExemplosAula6;

import java.util.Scanner;
public class Exemplo3 {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,5,12,9,2};
        String[] nomes = {"Ana", "Pedro", "Jonas", "Rodrigo"};
        System.out.println("O tamanho da lista é " +vetor.length);
        //posso alterar qualquer posição
        vetor[3]=30;
        System.out.println("Dados no vetor: ");
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]+" ");
        }
        System.out.println("\n Lista de nomes: ");
        for(int i=0;i<nomes.length;i++){

        }
    }

}
