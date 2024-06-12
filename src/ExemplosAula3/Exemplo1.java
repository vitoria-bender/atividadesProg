package ExemplosAula3;

    import java.util.Scanner;
    public class Exemplo1 {
        public static void main(String[] args){
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int numero = ler.nextInt();
            if(numero>0 && numero<10){
                System.out.println("o número é válido\n");
            }
            else {
                System.out.println("o número não é válido\n");
            }

        }
    }


