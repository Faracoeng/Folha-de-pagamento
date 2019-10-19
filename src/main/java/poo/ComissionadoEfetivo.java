package poo;

public class ComissionadoEfetivo extends Carreiras {
    private double adicional;

    public ComissionadoEfetivo(double fixo, double add) {
        this.nomeCarreira = "Comissionado efetico";
        this.salarioBase = fixo;
        this.adicional = add;
    }

    @Override
    public String getCarreira() {
        return null;
    }

    @Override
    public double calcularSalario() {
        return (this.salarioBase + this.adicional);
    }

    @Override
    public String toString() {
        return "ComissionadoEfetivo{" +
                "adicional=" + adicional +
                ", nomeCarreira='" + nomeCarreira + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    //@Override
    public void aumentarSalarioBase() {
        this.salarioBase = this.salarioBase * 1.1;
    }


}
