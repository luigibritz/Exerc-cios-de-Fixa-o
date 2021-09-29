import java.util.Scanner;

public class Genero {
    static Scanner ler = new Scanner (System.in);
    public static void main(String[] args) {

        String genero;
        
        System.out.println("Digite o gênero da pessoa: ");
        genero = ler.nextLine();

        if (genero == "f" || genero == "F") {
            System.out.println("O gênero da pessoa é feminino.  ");
        }else if (genero == "m" || genero =="M") {
            System.out.println("O gênero da pessoa é masculino.  ");
        }else{
            System.out.println("O gênero da pessoa é alternativo.  ");
        }
    }
}