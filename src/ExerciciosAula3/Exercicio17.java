package ExerciciosAula3;
//Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        float num1 = ler.nextFloat();
        System.out.println("Informe o segundo valor: ");
        float num2 = ler.nextFloat();
        System.out.println("Informe o terceiro valor: ");
        float num3 = ler.nextFloat();

        if(num1 < num2 && num1 < num3){
            float primeiroNum = num1;
        }
        else if(num1 < num2 && num1 > num3){

        }
    }
//if (a<b && b<c)
    // abc, acb, bac, bca, cab, cba.
}
