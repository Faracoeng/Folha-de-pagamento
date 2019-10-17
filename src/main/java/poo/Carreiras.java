package poo;

public  abstract class Carreiras {

    protected String nome;
    protected String cpf;
    protected double salarioBase;

    public abstract String getCarreira();
    public abstract double calcularSalario();

}
