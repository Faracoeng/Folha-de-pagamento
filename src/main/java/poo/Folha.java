package poo;

import java.util.ArrayList;

public class Folha{
    private ArrayList<Carreiras> lista;

    public Folha() {
        ArrayList<Carreiras> lista = new ArrayList();

    }

    private void aumentaSalario(){
        for(Carreiras e: lista){
           if (e instanceof ComissionadoEfetivo){       //Aumenta salário base apenas de Comissionado efetivo
               ((ComissionadoEfetivo) e).aumentarSalarioBase();
           }
        }
    }

    public void geraFolha(ArrayList<Carreiras> lista){
        for(Carreiras e: lista){
            System.out.println(e.nomeCarreira +": "+ e.calcularSalario());
        }
    }
}
