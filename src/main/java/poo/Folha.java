package poo;

import java.util.ArrayList;

public class Folha{
    private ArrayList<Carreiras> lista;

    public Folha() {
       this.lista = new ArrayList();
//        MensalFixo ms = new MensalFixo(1500);
//        this.lista.add(ms);
//
//        Comissionado c = new Comissionado(5000,1.2);
//        this.lista.add(c);
//
//        Horista h = new Horista(1000,12,10);
//        this.lista.add(h);
//
//        MensalFixo mf = new MensalFixo(2000);
//        this.lista.add(mf);

    }
    public boolean add(Carreiras colaborador){
        return this.lista.add(colaborador);
    }

    public void aumentaSalario(){
        for(Carreiras e: this.lista){
           if (e instanceof ComissionadoEfetivo){       //Aumenta salário base apenas de Comissionado efetivo
               ((ComissionadoEfetivo) e).aumentarSalarioBase();
           }
        }
    }

    public void geraFolha(){
        for(Carreiras e: this.lista){
            System.out.println(e.nomeCarreira +": "+ e.calcularSalario());  // Não é uma boa prático... (temporário)
        }
    }
}
