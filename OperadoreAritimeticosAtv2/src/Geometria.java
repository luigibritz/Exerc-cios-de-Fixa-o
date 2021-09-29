import java.util.Scanner;

public class Geometria {
    static Scanner ler = new Scanner (System.in);
    static int lados;
    static double arestas;
    public static void main(String[] args) {

        System.out.println("Digite a quantidade de lados do polígono regular que deseja calcular: ");
        lados = ler.nextInt();

        System.out.println("Digite o comprimento(cm) dos lados: ");
        arestas = ler.nextDouble();

        if (lados == 3) {
            System.out.println("TRIÂNGULO com área total de  " + (Math.pow(arestas, 2) / 2 ) + "cm².   ");
        }else if (lados == 4) {
            System.out.println("QUADRADO com área total de  " + (Math.pow(arestas, 2)) + "cm².   "); 
        }else{
            System.out.println("Formato inválido.   ");
        }

    }
}
