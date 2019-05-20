package poo;

public class Horista extends Carreiras {
    public double horasDeTrabalho;
    public double valorHora;

    public Horista(String nome, String cpf, double salarioBase, double qtdHoras, double bonus) {
        super(nome, cpf, salarioBase);
        this.horasDeTrabalho = qtdHoras;
        this.valorHora = bonus;
    }
}
