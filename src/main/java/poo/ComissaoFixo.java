package poo;

public class ComissaoFixo extends Comissionado {
    public ComissaoFixo(int vendasRealizadas, double porcentagem) {
        super(vendasRealizadas, porcentagem);
    }

//    public ComissaoFixo(String nome, String cpf, double salarioBase, int qtdVendas, double bonificacao) {
//        super(nome, cpf, salarioBase, qtdVendas, bonificacao);
//    }


    @Override
    public double calcularSalario() {
        return (vendasRealizadas * porcentagem);
    }

    //@Override
    public void aumentarSalarioBase() {
        //super.aumentarSalarioBase();
    }


}
