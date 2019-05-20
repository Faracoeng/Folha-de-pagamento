package poo;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
    ArrayList<Carreiras> colaboradores = new ArrayList<>();
    Carreiras  vendedor = new ComissaoFixo("Fulano de Tal", "100.838.259.08",1800,8,200);
    Carreiras guardinha = new Horista("Ciclano de Tal","097.189.987.08",954,6,100);
    Carreiras zelador = new Carreiras("Biclano de Tal","097.645.564.08",1000);
    Carreiras  representante = new Comissionado("Mulano de Tal", "098.761.167.08",1800,8,200);


    }
}
