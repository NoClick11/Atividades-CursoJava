
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite a quantidade de números");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }

        }
    }
}