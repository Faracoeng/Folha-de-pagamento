package poo;

public class MensalFixo extends Carreiras {

    public MensalFixo(double salario) {
        this.salarioBase = salario;
        this.nomeCarreira = "Mensal Fixo";
    }

    @Override
    public String getCarreira() {
        return this.nomeCarreira;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return "MensalFixo{" +
                "nomeCarreira='" + nomeCarreira + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }




}
