package main;

import entities.ImportedProduct;
import entities.Produto;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();


        System.out.println("Numeros de produtos");
        int n = sc.nextInt();

        for (int i=0; i<n; i++ ) {
            System.out.println("Comum, usado ou importado (c/u/i)");
            String type = sc.next();
            if (type.equals("c")) {
                System.out.println("Name");
                String name = sc.next();
                System.out.println("Price");
                Double price = sc.nextDouble();
                produtos.add(new Produto(price, name));

            }
            if (type.equals("u")) {
                System.out.println("Name");
                String name = sc.next();
                System.out.println("Price");
                Double price = sc.nextDouble();
                System.out.println("Manufacture date (DD/MM/YYYY) ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                produtos.add(new UsedProduct(price, name, date));
            }
            if (type.equals("i")) {
                System.out.println("Name");
                String name = sc.next();
                System.out.println("Price");
                Double price = sc.nextDouble();
                System.out.println("CustomFee");
                Double customsFee = sc.nextDouble();
                produtos.add(new ImportedProduct(price, name, customsFee));
            }

            System.out.println();
            System.out.println("ETIQUETAS DE PRECO:");
            for (Produto prod : produtos) {
                System.out.println(prod.priceTag());
            }
        }
    }
}