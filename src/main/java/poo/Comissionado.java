package poo;

public class Comissionado extends Carreiras {

    protected int vendasRealizadas;
    protected double porcentagem;


    public Comissionado(int vendasRealizadas, double porcentagem) {
        this.vendasRealizadas = vendasRealizadas;
        this.porcentagem = porcentagem;
    }

    @Override


    public String getCarreira() {
        return null;
    }

    @Override
    public double calcularSalario() {
        return vendasRealizadas*porcentagem;
    }

}
