package ExerciciosAula3;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um mês: ");
        String meses = ler.next();

        switch(meses){
            case "janeiro":
                System.out.println("Janeiro é mês 1.");
                break;
            case "fevereiro":
                System.out.println("Fevereiro é mês 2.");
                break;
            case "março":
                System.out.println("Março é mês 3.");
                break;
            case "abril":
                System.out.println("Abril é mês 4.");
                break;
            case "maio":
                System.out.println("Maio é mês 5.");
                break;
            case "junho":
                System.out.println("Junho é mês 6.");
                break;
            case "julho":
                System.out.println("Julho é mês 7.");
                break;
            case "agosto":
                System.out.println("Agosto é mês 8.");
                break;
            case "setembro":
                System.out.println("Setembro é mês 9.");
                break;
            case "outubro":
                System.out.println("Outubro é mês 10.");
                break;
            case "novembro":
                System.out.println("Novembro é mês 11.");
                break;
            case "dezembro":
                System.out.println("Dezembro é mês 12.");
                break;
        }
    }
}
