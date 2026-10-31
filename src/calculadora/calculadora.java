package calculadora;

public class calculadora {
    public int r = 0;

    public int calc(int a, int b, String op) {
        switch (op) {
            case "+":
                r = somar(a, b);
                break;
            case "-":
                r = subtrair(a, b); 
                break;
            case "*":
                r = multiplicar(a, b);
                break;
            case "/":
                r = dividir(a, b);
                break;
            default:
                System.out.println("Operacao invalida");
                r = 0;
        }
        System.out.println("Resultado = " + r);
        return r;
    }
}