import java.util.Scanner;

public class Semana{
    static Scanner ler = new Scanner (System.in);
    static int dia = 1;
    public static void main(String[] args) {

        System.out.println("Menu para a escolha dos dias da semana:  ");

        System.out.println("*****************************************");
    
        System.out.println("1 para Domingo  ");
       
        System.out.println("2 para Segunda-feira:   ");
       
        System.out.println("3 para Terça-feira:  ");
        
        System.out.println("4 para Quarta-feira:  ");
        
        System.out.println("5 para Quinta-feira:  ");
        
        System.out.println("6 para Sexta-feira:  ");
        
        System.out.println("7 para Sábado:  ");


        System.out.println("Digite os números da semana:  ");
        dia = ler.nextInt();

        switch (dia) {
            case 1:
            System.out.println("Domingo");
            break;

            case 2:
            System.out.println("Segunda-feira");
            break;

            case 3:
            System.out.println("Terça-feira");
            break;

            case 4:
            System.out.println("Quarta-feira");
            break;

            case 5:
            System.out.println("Quinta-feira");
            break;

            case 6:
            System.out.println("Sexta-feira");
            break;

            case 7:
            System.out.println("Sábado");
            break;

            default:
            System.out.println("Dia inválido.   ");

        }

    }
}