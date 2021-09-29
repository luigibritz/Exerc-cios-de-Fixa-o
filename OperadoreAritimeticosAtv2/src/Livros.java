import java.util.Scanner;

public class Livros {
    static Scanner ler = new Scanner (System.in);
    static int ql;
    static Double pl;
    public static void main(String[] args) {
        
        System.out.println("Olá, seja bem vindo à nossa livraria online. Por favor digite abaixo quantos livros gostaria de adquirir:  ");
        ql = ler.nextInt();

        System.out.println("Digite o valor do livro desejado:   ");
        pl = ler.nextDouble();


        if (ql >= 5) {
            System.out.println("Parabéns você acaba de ganhar 50% de desconto em suas compras!! O preço total é de R$ " + (pl * ql) / 3);
        }else{
            System.out.println("O preço total é de R$ " + (pl * ql));
        }
    }
}