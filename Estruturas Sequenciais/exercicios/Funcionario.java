package exercicios;

import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número, salario e horas trabalhadas");
        int numero = sc.nextInt();
        double salario = sc.nextDouble();
        int horas = sc.nextInt();
        System.out.println("Número: " + numero);
        System.out.println("Salario: " + salario*horas);
    }
}
