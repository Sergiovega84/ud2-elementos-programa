package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        int aleatorio = r.nextInt(101);
        String respuesta;
        int n = 0;
        int x = 0;

        do {
            System.out.print("Escribe: número o FIN ");
            respuesta = br.readLine();
            if (!respuesta.equalsIgnoreCase("FIN")) {
                n = Integer.parseInt(respuesta);
                if (n == aleatorio) {
                    System.out.println("Número correcto, ");
                } else if (n > aleatorio) {
                    System.out.println("Te has pasado...");
                } else {
                    System.out.println("No llegas...");
                }
                x = x+ 1;
            }

        } while (!respuesta.equalsIgnoreCase("FIN") && n != aleatorio);

        if (n != aleatorio)
            System.out.println("Hasta la próxima");
        else {
            System.out.println("lo has conseguido en " +x+ " intentos");


        }
    }
}