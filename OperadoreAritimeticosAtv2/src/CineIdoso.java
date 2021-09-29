import java.util.Scanner;

public class CineIdoso {
    static Scanner ler = new Scanner (System.in);
    static String nome;
    static int idade;
    public static void main(String[] args) {

        System.out.println("Bem vindo ao cinema!  ");

        System.out.println("Por favor, digite seu nome:  ");
        nome = ler.nextLine();

        System.out.println("Por favor digite sua idade:  ");
        idade = ler.nextInt();

        if (idade >= 65) {
            System.out.println("Aqui está seu ingresso meia-entrada " + nome);
            System.out.println("O valor total é de R$ 15,00  ");
        }else{
            System.out.println("Aqui está seu ingresso " + nome);
            System.out.println("O valor total é de R$ 30,00");
        }

    }
}
