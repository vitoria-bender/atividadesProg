package ExerciciosAula7;

import java.util.Random;

public class Exercicio4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] matrizG = new int [3][3];
        int []sl = new int[3];
        int []sc = new int[3];

        for(int l=0; l<3; l++){
            for(int c=0; c<3; c++){
                matrizG[l][c] = aleatorio.nextInt(1, 20);

            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;i<3;i++){
                sl[i] = sl[i]+matrizG[i][j];
            }
        }
    }
}
