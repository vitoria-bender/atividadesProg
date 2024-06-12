package ExemplosAula8;

import java.util.Random;

public class Exemplo2metodo {

    static String imprimeMatriz(int[][] matriz) {
        String retorno = "";
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                retorno += String.format("%02d", matriz[l][c]);
                //retoro = retorno + String.format("%02d");
            }
            retorno += "\n";
        }

        return retorno;
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] matriz = new int[5][3];
        for(int l = 0; l<matriz.length;l++){
            for(int c=0; c<matriz[l].length;c++){
                matriz[l][c] = aleatorio.nextInt(100);
            }
        }
    }
}
