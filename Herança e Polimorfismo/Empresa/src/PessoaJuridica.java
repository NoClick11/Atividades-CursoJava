public class PessoaJuridica extends Pessoa {

    private int funcionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, int funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public Double tax() {
        if (getFuncionarios()<10) {
            return getRendaAnual() * 0.16;
        } else {
            return getRendaAnual() * 0.14;
        }
    }

}
