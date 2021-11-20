package org.josue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestPatron {
    public static void main(String args[]) throws IOException {

        FacadeCajero facade = new FacadeCajero();
        BufferedReader entrada =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Seleccione la opcion a realizar:" +
                "\n1- Retirar Dinero " +
                "\n2- Recargar Móvil " +
                "\n> ");
        int opcion = Integer.parseInt(entrada.readLine());

        if (opcion == 1) {
            System.out.println(facade.sacarDinero());
        }
        else if (opcion == 2){
            System.out.println(facade.recargaMovil());
        }
        else { System.out.println("\nLa opcion seleccionada no posee niguna funcion. \n\t-- Programa finalizado --");}

    }
}
