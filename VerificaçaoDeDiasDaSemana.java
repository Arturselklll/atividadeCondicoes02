import java.util.Scanner;

public class VerificaçaoDeDiasDaSemana {
    public static void main(String[] args) {

        int dia = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um dia da semana:");
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido. Por favor, insira um número entre 1 e 7.");
                break;
        }



    }
}
