package ExerciciosAula3;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a idade do nadador: ");
        int idade = ler.nextInt();

        if(idade < 5){
            System.out.println("O nadador não está em nenhuma categoria\n");
        }
        else if(idade >= 5 && idade <= 7){
            System.out.println("O nadador está na categoria infantil A\n");
        }
        else if(idade > 7 && idade <= 10){
            System.out.println("O nadador está na categoria infantil B\n");
        }
        else if(idade > 10 && idade <= 13){
            System.out.println("O nadador está na categoria juvenil A\n");
        }
        else if(idade > 13 && idade <= 17){
            System.out.println("O nadador está na categoria juvenil B\n");
        }
        else{
            System.out.println("o nadador está na categoria adulto\n");
        }
    }
}
