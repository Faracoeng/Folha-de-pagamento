package poo;

public  class Carreiras {
    protected String nome;
    protected String cpf;
    public double salarioBase;

    public Carreiras(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public void aumentarSalarioBase(){
        salarioBase *= 1.1;
    }

    public  double calcularSalario(){
            return salarioBase;
    }

    @Override
    public String toString() {
        return "Carreiras{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salarioBase=" + calcularSalario() +
                '}';
    }

}
