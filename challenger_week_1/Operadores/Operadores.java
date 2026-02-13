//Nivel 1 Calculadora Humana
// Qual valor final de cada variavel

public class Operadores { // É uma boa prática iniciar nomes de classes com letra maiúscula

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int soma = a + b; // valor: 13
        int multi = a * b; // valor: 30
        int divisao = a / b; // valor: 3 (Cuidado aqui!)
        int resto = a % b; // valor: 1

        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multi);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
    }
}
