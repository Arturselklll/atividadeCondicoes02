import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {

        int idade = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();


        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
