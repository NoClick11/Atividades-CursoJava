package exercicios;

import java.util.Scanner;

public class Pecas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primera peça");
        int codigo1 = sc.nextInt();
        int numero1 = sc.nextInt();
        double preco1 = sc.nextDouble();
        System.out.println("Digite a segunda peça");
        int codigo2 = sc.nextInt();
        int numero2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        double soma1 = numero1*preco1;
        double soma2 = numero2*preco2;
        double valorTotal = soma1+soma2;

        System.out.println("Valor total: " + valorTotal);
    }
}