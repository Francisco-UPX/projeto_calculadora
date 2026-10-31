package calculadora;

/**
 * Classe responsável por realizar cálculos matemáticos básicos para o aplicativo FinançApp.
 * 
 * @author Francisco Santana Almeida
 * @version 2.0
 */
public class calculadora {
    
    /** Armazena o resultado da última operação realizada. */
    public int r = 0;

    /**
     * Executa uma operação matemática básica.
     * 
     * @param a O primeiro número inteiro.
     * @param b O segundo número inteiro.
     * @param op O operador matemático (+, -, *, /).
     * @return O resultado da operação.
     */
    public int calc(int a, int b, String op) {
        switch (op) {
            case "+": r = somar(a, b); break;
            case "-": r = subtrair(a, b); break;
            case "*": r = multiplicar(a, b); break;
            case "/": r = dividir(a, b); break;
            default:
                System.out.println("Operacao invalida");
                r = 0;
        }
        return r;
    }

    /** 
     * Realiza a soma de dois números.
     * @param a Primeiro número. 
     * @param b Segundo número. 
     * @return O resultado da soma. 
     */
    private int somar(int a, int b) { return a + b; }

    /** 
     * Realiza a subtração de dois números.
     * @param a Primeiro número. 
     * @param b Segundo número. 
     * @return O resultado da subtração. 
     */
    private int subtrair(int a, int b) { return a - b; }

    /** 
     * Realiza a multiplicação de dois números.
     * @param a Primeiro número. 
     * @param b Segundo número. 
     * @return O resultado da multiplicação. 
     */
    private int multiplicar(int a, int b) { return a * b; }

    /**
     * Realiza a divisão de dois números.
     * @param a Dividendo.
     * @param b Divisor.
     * @return O resultado da divisão.
     * @throws IllegalArgumentException Se o divisor for zero.
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Erro: divisao por zero, operação irregular");
        }
        return a / b;
    }
}