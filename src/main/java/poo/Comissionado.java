package poo;

public class Comissionado extends Carreiras {

    protected int vendasRealizadas;
    protected double porcentagem;

    public Comissionado(String nome, String cpf, double salarioBase, int qtdVendas,double bonificacao) {
        super(nome, cpf, salarioBase);
        this.vendasRealizadas = qtdVendas;
        this.porcentagem = bonificacao;
    }

    @Override
    public double calcularSalario() {
        return vendasRealizadas*porcentagem;
    }

}
