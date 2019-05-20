package poo;

public class Comissionado extends Carreiras {

    private int vendasRealizadas;
    private double porcentagem;

    public Comissionado(String nome, String cpf, double salarioBase, int qtdVendas,double bonificacao) {
        super(nome, cpf, salarioBase);
        this.vendasRealizadas = qtdVendas;
        this.porcentagem = bonificacao;
    }


}
