package ExerciciosAula3;
//Escreva um algoritmo que leia o código de uma figura geométrica (1 - triângulo, 2 - quadrado, 3 - círculo,
// 4 - retângulo). Depois de escolhida a figura, leia as informações necessárias para calcular a área da
// figura correspondente, calcule e escreva o valor da área.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("TABELA DE CÓDIGOS DE FIGURAS GEOMÉTRICAS: \n");
        System.out.println("1 - triângulo\n2 - quadrado\n3 - círculo\n4 - retângulo\n");
        System.out.println("Informe um código para calcular área: ");
        int cod = ler.nextInt();

        if(cod == 1){
            System.out.println("Informe o valor da base: ");
            float base = ler.nextFloat();
            System.out.println("Informe o valor da altura: ");
            float altura = ler.nextFloat();
            float area = (base*altura)/2;
            System.out.printf("A área do triângulo é de %.2f", area);
        }
        else if(cod == 2){
            System.out.println("Informe o valor do lado: ");
            float lado = ler.nextFloat();
            float area = lado*lado;
            System.out.printf("A área do quadrado é de %.2f", area);
        }
        else if(cod == 3){
            System.out.println("Informe o valor do raio: ");
            float raio = ler.nextFloat();
            Double area = raio*raio*3.14;
            System.out.printf("A área do círculo é de %.2f", area);
        }
        else if(cod == 4){
            System.out.println("Informe o valor da base: ");
            float base = ler.nextFloat();
            System.out.println("Informe o valor da altura: ");
            float altura = ler.nextFloat();
            float area = base*altura;
            System.out.printf("A área do retângulo é de %.2f", area);
        }
    }

}
