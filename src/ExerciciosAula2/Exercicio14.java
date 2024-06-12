package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual sua quilometragem no início do dia?: ");
        int kmInicial = ler.nextInt();
        System.out.print("Qual sua quilometragem ao final do dia?: ");
        int kmFinal = ler.nextInt();
        System.out.print("Quantos litros de combustível você gastou hoje: ");
        float litros = ler.nextFloat();
        System.out.print("Qual o valor bruto que você recebeu?: ");
        float valor = ler.nextInt();
        float kmRodado = kmFinal - kmInicial;
        float carro = kmRodado/litros;
        float lucro = valor - litros*(float)4.15;
        System.out.printf("Seu veículo roda %.2fkm/l\n", carro);
        System.out.printf("Seu lucro do dia foi: R$%.2f\n", lucro);
    }
}
