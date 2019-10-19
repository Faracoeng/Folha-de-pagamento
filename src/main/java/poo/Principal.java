package poo;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
    Folha colaboradores = new Folha();

    ComissionadoEfetivo ce = new ComissionadoEfetivo(1500,500);
    colaboradores.add(ce);

    Comissionado c = new Comissionado(5000,1.2);
    colaboradores.add(c);

    Horista h = new Horista(1000,12,10);
    colaboradores.add(h);

    MensalFixo mf = new MensalFixo(2000);
    colaboradores.add(mf);

    System.out.println("Antes:");
    colaboradores.geraFolha();
    colaboradores.aumentaSalario();
    System.out.println("Depois:");
    colaboradores.geraFolha();

    }
}
