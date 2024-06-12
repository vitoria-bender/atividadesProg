package ExerciciosAula2;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = ler.next();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = ler.next();
        System.out.print("Bem vindo vi"+nome+" "+sobrenome);
    }
}
