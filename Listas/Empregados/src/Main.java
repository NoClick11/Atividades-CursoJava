import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionarios> funcionarios = new ArrayList<>();


        System.out.println("Quantidade de funcionários");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Salario: ");
            Double salario = sc.nextDouble();
            System.out.println("Nome: ");
            String nome = sc.next();

            funcionarios.add(new Funcionarios(id, salario, nome));
        }

        System.out.println("Digite o id do funcionario que vai ter seu salario aumentado");
        int id = sc.nextInt();
        Funcionarios funcionarios1 = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (funcionarios1 == null) {
            System.out.println("Id não encontrado");
        } else {
            System.out.println("A porcentagem do aumento");
            double quantidade = sc.nextDouble();
            funcionarios1.aumentarSalario(quantidade);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Funcionarios obj : funcionarios) {
            System.out.println(obj);
        }
     }
}