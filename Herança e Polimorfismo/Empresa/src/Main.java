import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.println("Número de pessoas");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Fisica ou Juridica (F/j)");
            String type = sc.next();
            System.out.println("Nome: ");
            String name = sc.next();
            System.out.println("Renda Anual: ");
            Double rendaAnual = sc.nextDouble();
            if (type.equals("F")) {
                System.out.println("Gastos com saúde");
                Double gastosSaude = sc.nextDouble();
                list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
            } else {
                System.out.println("Número de funcionarios");
                int numeroFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(name, rendaAnual, numeroFuncionarios));
            }
        }
        double sum = 0.0;

        for (Pessoa pessoa : list) {
            double tax = pessoa.tax();
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
    }
}