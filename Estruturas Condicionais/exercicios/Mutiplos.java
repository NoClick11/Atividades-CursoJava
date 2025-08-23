package exercicios;

import java.util.Scanner;

public class Mutiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("É mutiplo");
        } else {
            System.out.println("Não e mutiplo");
        }
    }
}
