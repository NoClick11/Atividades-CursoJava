import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quartos quartos[] = new Quartos[10];

        System.out.println("Quantos estudantes");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Digite seu nome");
            String nome = sc.next();
            System.out.println("Digite seu email");
            String email = sc.next();
            System.out.println("Qual quarto ?");
            int quarto = sc.nextInt();
            quartos[quarto] = new Quartos(nome, email);
        }

        for (int i=0; i<quartos.length; i++) {
            if (quartos[i]  != null) {
                System.out.println("Número do quarto" + i);
                System.out.println(quartos[i]);
            }
        }

    }
}