package poo;

public class ComissaoFixo extends Comissionado {
    public ComissaoFixo(String nome, String cpf, double salarioBase, int qtdVendas, double bonificacao) {
        super(nome, cpf, salarioBase, qtdVendas, bonificacao);
    }

    //@Override
//    public double calcularSalario() {
//       // return this.;
//    }

    @Override
    public void aumentarSalarioBase() {
        super.aumentarSalarioBase();
    }


}
