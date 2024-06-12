package ExerciciosAula3;

import java.util.Scanner;
//Crie um algoritmo que pergunte ao usuário se ele deseja converter uma temperatura de graus Celsius
// em graus Fahrenheit ou Fahrenheit em Celsius. Em seguida mostre na tela o valor final correspondente
// à opção escolhida pelo usuário. F = 1.8 * C + 32 | C = (F – 32) / 1.8;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("F -> para converter de ºF para ºC e C -> de ºC para ºF");
        char opc = ler.next().toLowerCase().charAt(0);

        //switch(){
           // default -> System.out.println("opção inválida!");
        }
    }

//char opc = ler.next().toLowerCase().charAt(0);
// char opção = ler.next(que devolve string), toLowerCase(que transforma tudo em minúsculo), charAt(devolve uma
// letra específica do string, neste caso, o caractere 0).

