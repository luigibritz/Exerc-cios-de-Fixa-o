import java.util.Scanner;

public class IgualDiferente {
    static int n1, n2;
    static Scanner ler = new Scanner (System.in);
    public static void main(String[] args) {
        
        System.out.println("Digite o valor 1: ");
        n1 = ler.nextInt();

        System.out.println("Digite o valor 2: ");
        n2 = ler.nextInt();

        if (n1 == n2) {
            System.out.println("Os números digitados são iguais!  ");
        }else {
            System.out.println("Os números digitados são diferentes!  ");
        }

    }
}
