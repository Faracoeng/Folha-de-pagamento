package poo;

public  class Carreiras {
    public String nome;
    public String cpf;
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
                ", salarioBase=" + salarioBase +
                '}';
    }
    //private void horasTrabalhadas();

}
