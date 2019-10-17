package poo;

import java.util.ArrayList;

public class Folha {
    //private static


    public Folha(Carreiras colaborador) {
        ArrayList<Carreiras> funcionarios = new ArrayList<>();
        funcionarios.add(colaborador);
    }

    private void aumentaSalario(ArrayList<Carreiras> lista){
        for(Carreiras e: lista){

        }
    }

    public void geraFolha(ArrayList<Carreiras> lista){
        for(Carreiras e: lista){
            e.toString();
            System.out.println("------------------");
        }
    }
}
