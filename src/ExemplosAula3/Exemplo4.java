package ExemplosAula3;

import java.util.Scanner;
public class Exemplo4 {
    public static void main(String[] args) {
        String Usuario;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o usuário: ");
        Usuario = ler.next();

        if(Usuario .equals("admin")){
            System.out.println("O usuário está correto\n");
        }
        else {
            System.out.println("O usuário está incorreto\n");
        }
    }
}
