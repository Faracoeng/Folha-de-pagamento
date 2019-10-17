package poo;

public class Horista extends Carreiras {
    private double horasDeTrabalho;
    private double valorHora;
    private final String  carreira = "Horista";

    public Horista(String nome, String cpf, double horasDeTrabalho, double valorHora, double salarioBase) {
        this.horasDeTrabalho = horasDeTrabalho;
        this.valorHora = valorHora;
        salarioBase = salarioBase;
    }

    @Override
    public String getCarreira() {
        return this.carreira;
    }

    @Override
    public double calcularSalario() {
        return ((horasDeTrabalho * valorHora) + salarioBase);
    }
}
