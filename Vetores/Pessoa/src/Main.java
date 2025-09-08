import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessooas");
        n = sc.nextInt();

        Pessoa pessoa[] = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nome:");
            String nome = sc.next();
            System.out.println("Idade:");
            int idade = sc.nextInt();
            System.out.println("Altura:");
            double altura = sc.nextDouble();

            pessoa[i] = new Pessoa(nome, idade, altura);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(pessoa[i]);
        }
    }
}