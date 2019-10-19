package poo;

public class Comissionado extends Carreiras {

    protected int vendasRealizadas;
    protected double porcentagem;


    public Comissionado(int vendasRealizadas, double porcentagem) {
        this.vendasRealizadas = vendasRealizadas;
        this.porcentagem = porcentagem;
        this.nomeCarreira = "Comissionado";
    }

    @Override


    public String getCarreira() {
        return null;
    }

    @Override
    public double calcularSalario() {
        return vendasRealizadas*porcentagem;
    }

    @Override
    public String toString() {
        return "Comissionado{" +
                "vendasRealizadas=" + vendasRealizadas +
                ", porcentagem=" + porcentagem +
                ", nomeCarreira='" + nomeCarreira + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
