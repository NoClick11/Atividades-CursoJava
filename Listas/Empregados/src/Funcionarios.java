public class Funcionarios {

    private int id;
    private String nome;
    private Double salario;

    public Funcionarios(int id, Double salario, String nome) {
        this.id = id;
        this.salario = salario;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double quantidade) {
        salario += salario* quantidade / 100 ;
    }

    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }

}
