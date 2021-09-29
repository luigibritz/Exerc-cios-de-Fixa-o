import java.util.Scanner;

public class Senha {
    static Scanner ler = new Scanner (System.in);
    static int senha;
    public static void main(String[] args) {
        System.out.println("Digite seu nome:  ");
        ler.nextLine();

        System.out.println("Digite a senha numérica de acesso: ");
        senha = ler.nextInt();

        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO.");
        }else{
            System.out.println("ACESSO NEGADO.");
        }

    }
}
