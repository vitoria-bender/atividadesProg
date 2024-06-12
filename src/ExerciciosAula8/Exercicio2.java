package ExerciciosAula8;

//Crie um método que receba três valores, 'a', 'b' e 'c', que são os coeficientes de uma equação do segundo
// grau e retorne o valor do delta, que é dado por 'b² - 4ac' função que verifica se existem raízes reais.
//Criar outra função calculaX, para calcular os resultados da equação
//Usando as 2 funções acima, crie um aplicativo que calcula as raízes de uma equação do 2o grau: ax² + bx + c=0
//Para ela existir, o coeficiente 'a' deve ser diferente de zero.
//Caso o delta seja maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as reais
// serão complexas, apenas informe que não existem raízes racionais
//
//Math.sqrt(25);
//
//Exemplo
//3x² -7x+4=0
//X’ = 1,33
//X” = 1


public class Exercicio2 {

    static float calculoDelta(float a, float b, float c) {
        float d = b * b - 4 * a * c;
        return d;
    }

    static float calculaX(float a, float b, float d, char opc) {
        if (opc == '+') {
            float x = (-b + (float) Math.sqrt(d)) / (2 * a);
            return x;
        }
        else {
            float x = (-b - (float) Math.sqrt(d)) / (2 * a);
            return x;
        }
    }
}
