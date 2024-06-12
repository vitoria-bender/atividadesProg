package ExerciciosAula3;

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String senhapre = "12345678"; //se a senha começar com zeros em int eles serão cortados, e o string previne isso.
        System.out.println("Digite a senha de oito dígitos: ");
        String senha = ler.next();
        if(senha.equals(senhapre)){
            System.out.println("Acesso autorizado\n");
        }
        else{
            System.out.println("Acesso negado\n");
        }
    }
}
