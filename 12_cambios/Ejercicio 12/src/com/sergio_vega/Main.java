package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int precio;
        int saldo;
        int cambio;

	do {
        System.out.print("Introduce valor del producto ");
        double x = Double.parseDouble(br.readLine());
        precio = (int) (x * 100);
    } while (! (precio > 0 && precio % 5 == 0));

	do {
        System.out.print("Introduce saldo introducido ");
        double y = Double.parseDouble(br.readLine());
        saldo = (int) (y * 100);
    } while (!(saldo > 0 && saldo % 5 == 0));
	    cambio = (saldo - precio);
	    if (!(cambio >= 0)) {
            System.out.println("Introducir más dinero");
        }
        while (!(cambio >= 0));


        System.out.println("el cambio es " +cambio+ " céntimos");
        if (cambio == 0) {
            System.out.println("El importe introducido es exacto");
        }else {
            int z = cambio / 200;
            System.out.println(z + " monedas de 2 €");
            cambio = cambio % 200;

            z = cambio / 100;
            System.out.println(z + " monedas de 1 €");
            cambio = cambio % 100;

            z = cambio / 50;
            System.out.println(z + " monedas de 50 céntimos");
            cambio = cambio % 50;

            z = cambio / 20;
            System.out.println(z + " monedas de 20 céntimos");
            cambio = cambio % 20;

            z = cambio / 10;
            System.out.println(z + " monedas de 10 céntimos");
            cambio = cambio % 10;

            z = cambio / 5;
            System.out.println(z + " monedas de 5 céntimos");


        }
    }
}
