import java.util.Scanner;

public class Calculadora {
    static Scanner ler = new Scanner (System.in);
    static int op;
    static double a, b;
    public static void main(String[] args) {
        
        System.out.println("Calculadora");
        System.out.println("Menu de Operações:  ");
        System.out.println("Digite 1 para Adição:  ");
        System.out.println("Digite 2 para Subtração:  ");
        System.out.println("Digite 3 para Multiplicação:  ");
        System.out.println("Digite 4 para Divisão:  ");
        op = ler.nextInt();

        System.out.println("**************************************");

        System.out.println("Digite o primeiro número:  ");
        a = ler.nextDouble();

        System.out.println("Digite o segundo número:  ");
        b = ler.nextDouble();

        switch (op) {
            case 1:
            System.out.println("O resultado da soma dos números é: " + (a + b));
            break;

            case 2:
            System.out.println("O resultado da soma dos números é: " + (a - b));
            break;

            case 3:
            System.out.println("O resultado da soma dos números é: " + (a * b));
            break;

            case 4:
            System.out.println("O resultado da soma dos números é: " + (a / b));
            break;
            
        }
    }

}
