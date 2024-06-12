package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a largura da sua cozinha: ");
        Float largura = ler.nextFloat();
        System.out.print("Digite a altura da sua cozinha: ");
        Float altura = ler.nextFloat();
        System.out.print("Digite o comprimento da sua cozinha: ");
        Float comprimento = ler.nextFloat();
        System.out.print("Digite a área ocupada por janelas e portas: ");
        float aberturas = ler.nextFloat();
        float areaTotal = (largura*altura+comprimento*altura)*2;
        areaTotal = aberturas;
        Float quantCaixas = areaTotal/(float)1.5;
        //quantCaixas = (float) Math.ceil(quantCaixas);
        System.out.printf("Serão necessárias %f caixas de azulejo para cobrir uma área" +
                " de %.2f m²\n", quantCaixas,areaTotal);
    }
}
