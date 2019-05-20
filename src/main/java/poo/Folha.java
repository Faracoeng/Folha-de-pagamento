package poo;

import java.util.ArrayList;

public class Folha {
    private static ArrayList<Carreiras> funcionarios = new ArrayList<>();





    public double CalcularDescontoIRPF(double salario) {

        double desconto = 0.0;
        if(salario > 1499.15 && salario <= 2246.75) {
            desconto = salario - (7.5/100 * salario);
        }

        if (salario > 2246.75 && salario <= 2995.70) {
            desconto = salario - (15.0 / 100 * salario);
        }

        if (salario > 2995.70 && salario <= 3743.19) {
            desconto = salario - (22.5 / 100 * salario);
        }

        if (salario > 3743.19) {
            desconto = salario - (27.5 / 100 * salario);
        }

        return desconto;

    }
}
