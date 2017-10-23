package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    Double resultado;
	    String opcion;

        do {

            System.out.print("introduce primer valor ");
            Double x = Double.parseDouble(br.readLine());
            System.out.print("Introduce segundo valor ");
            Double y = Double.parseDouble(br.readLine());

            System.out.println("Menu");
            System.out.println("----");
            System.out.println("a) Suma.");
            System.out.println("b) Resta.");
            System.out.println("c) Multiplicación.");
            System.out.println("d) División.");
            System.out.println("e) Resto.");
            System.out.println("f) Terminar.");
            System.out.println(" ");
            System.out.println("Introduzca una opción");
            opcion = br.readLine();

            switch (opcion) {
                case "a":
                    resultado = x + y;
                    System.out.println("El resultado de la suma es " +resultado);
                    break;
                case "b":
                    resultado = x - y;
                    System.out.println("El resultado de la resta es " +resultado);
                    break;
                case "c":
                    resultado = x + y;
                    System.out.println("El resultado de la multipicación es " +resultado);
                    break;
                case "d":
                    resultado = x / y;
                    System.out.println("El resultado de la división es " +resultado);
                    break;
                case "e":
                    resultado = x % y;
                    System.out.println("El resultado del resto es " +resultado);
                    break;
                case "f":
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("Opción no válida ");

            }
    }while (opcion.equalsIgnoreCase("f") == false);

        }
}
