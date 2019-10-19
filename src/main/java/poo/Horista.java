package poo;

public class Horista extends Carreiras {
    private double horasDeTrabalho;
    private double valorHora;

    public Horista( double fixo, double horasDeTrabalho, double valorHora) {
        this.horasDeTrabalho = horasDeTrabalho;
        this.valorHora = valorHora;
        this.salarioBase = fixo;
        this.nomeCarreira = "Horista";
    }

    @Override
    public String getCarreira() {
        return this.nomeCarreira;
    }

    @Override
    public double calcularSalario() {
        return ((horasDeTrabalho * valorHora) + salarioBase);
    }

    @Override
    public String toString() {
        return "Horista{" +
                "horasDeTrabalho=" + horasDeTrabalho +
                ", valorHora=" + valorHora +
                ", nomeCarreira='" + nomeCarreira + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
