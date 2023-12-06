package cursojava.maratonajava.cursojava.maratonajava;

public class Aula02Operadores {

    public static void main(String[] args) {
        // Operadores Aritméticos
        double number1 = 10;
        double number2 = 4;

        double sum = number1 + number2;
        double subtraction = number1 - number2;
        double division = number1 / number2;
        double multiplication = number1 * number2;
        double rest = number1 % number2;
        double increment = ++number1;
        double decrement = --number2;
       

        // Operadores de Atribuição
        int i = 10;
        i += 2; // Soma 2 a variável
        i -= 2; // Subtrai 2 a variável
        i *= 2; // Multiplica a variável por 2
        i /= 2; // Divide a variável por 2
        i %= 3; // Retorna o módulo da variável por 3
        
        
        // Operadores de Comparação
        int x = 2;
        boolean equal = 2 == x;
        boolean notEqual = 2 != x;
        boolean greater = 3 > x;
        boolean less = 1 < x;
        boolean greaterEqual = 2 >= x;
        boolean lessEqual = 2 <= x;
        
        
        // Operadores Lógicos
        // "||" seria o "OR"
        // "&&" seria o "AND"
        // "!" seria o "NOT"
    }

}
