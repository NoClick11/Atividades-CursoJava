package exercicios;

import java.util.Scanner;

public class DiferençaProduto {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quatro números");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println("A soma da diferença é: " + ((a*b)-(c*d)));

    }
}
