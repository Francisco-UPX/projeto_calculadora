

import calculadora.calculadora;

/**
 * Classe para execução de testes unitários manuais da Calculadora.
 * @author Francisco Santana Almeida
 * @version 2.0
 */

public class testeCalculadora {
     public static void main(String[] args) {
        calculadora calc = new calculadora();

        System.out.println(calc.calc(2, 3, "+"));
        System.out.println(calc.calc(10, 4, "-"));
        System.out.println(calc.calc(3, 5, "*"));
        System.out.println(calc.calc(8, 2, "/"));

        try {
            System.out.println(calc.calc(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calc(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}