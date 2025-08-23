package exercicios;

import java.util.Scanner;

public class RaioCirculo {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio de um círculo");
        double raio = sc.nextDouble();
        System.out.println("A área é " + pi*(raio*raio));

    }
}
