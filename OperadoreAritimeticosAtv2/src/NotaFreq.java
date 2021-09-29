import java.util.Scanner;

public class NotaFreq {
    
    static double media;
    static int frequencia;
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite a média do aluno: ");
        media = ler.nextDouble();

        System.out.println("Digite a frequência do aluno: ");
        frequencia = ler.nextInt();

        if ((media >=6) && (frequencia >=75)) {
            System.out.println("O aluno está APROVADO!  ");
        }else {
            System.out.println("O aluno está REPROVADO!  ");
        }

    }
}