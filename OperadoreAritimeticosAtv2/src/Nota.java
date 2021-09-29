import java.util.Scanner;

public class Nota {
    static Scanner ler = new Scanner (System.in);
    static String nome, disciplina;
    static double n1, n2, n3, freq, media;
    public static void main(String[] args) {
        
        System.out.println("Digite o nome do aluno:  ");
        nome = ler.nextLine();

        System.out.println("Digite a disciplina do aluno:  ");
        disciplina = ler.nextLine();

        System.out.println("Digite a frequência do aluno:  ");
        freq = ler.nextDouble();

        System.out.println("Digite a nota 1:  ");
        n1 = ler.nextDouble();

        System.out.println("Digite a nota 2:  ");
        n2 = ler.nextDouble();

        System.out.println("Digite a nota 3:  ");
        n3 = ler.nextDouble();

        System.out.println("Qual a frquência do aluno? " + freq + "%  ");
 
        media = (n1 + n2 + n3) / 3;

        System.out.println("A média final é " + media);

        System.out.println("O nome do aluno é: " + nome + "\n"
                            + "A disciplina do aluno é: " + disciplina + "\n"
                                 + "A frequência do aluno é: " + freq + "\n"
                                     + "A média do aluno é:    " + media);

        if (media >= 6 && freq >=75) {
            System.out.println("O aluno está APROVADO!   ");
        }else{
            System.out.println("O aluno está REPROVADO!   ");
        }

    }
}
