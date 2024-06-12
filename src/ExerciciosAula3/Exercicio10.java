package ExerciciosAula3;
// A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de recuperação ou foi reprovado.
// A média de aprovação é >= 7.0; a média de recuperação é >= 5.0 e < 7.0; e a média do reprovado é < 5.0
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = ler.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = ler.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = ler.nextFloat();
        float calc = (nota1 + nota2 + nota3)/3;
        if(calc >= 7){
            System.out.printf("Aluno aprovado com média de %.2f", calc);
        }
        else if(calc >= 5 && calc < 7){
            System.out.printf("Aluno em recuperação com média de %.2f", calc);
        }
        else{
            System.out.printf("Aluno reprovado com média de %.2f", calc);
        }
    }
}
