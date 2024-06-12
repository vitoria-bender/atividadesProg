package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.print("Comprimento da pista em metros: ");
        float comprimento = ler.nextFloat()/1000;
        System.out.print("Número de voltas: ");
        int voltas = ler.nextInt();
        System.out.print("Quantidade de abastecimentos: ");
        int abast = ler.nextInt();
        System.out.print("Qual a autonomia do veículo em Km/L: ");
        float autonomia = ler.nextFloat();
        float distancia = comprimento * voltas;
        float combustivelT = distancia/autonomia;
        float litrosAbast = combustivelT/abast;
        System.out.printf("Para percorrer os %.2f Km de prova, serão necessários " +
                "%.2f litros por abastecimento\n", distancia, litrosAbast);

    }

}

