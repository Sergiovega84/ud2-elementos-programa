package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        int aleatorio = r.nextInt(100);
        int x = 0;

        System.out.print("Introduce número o FIN: ");

        String respuesta = br.readLine();

        while (!respuesta.equals("FIN")) {

            int n = Integer.parseInt(respuesta);
            if (n == aleatorio) {
                System.out.print( "Has acertado, has usado " +x+ " intentos");
                break;
            } else if (n > aleatorio) {
                System.out.print("Te has pasado, ");
                x = x + 1;
            }else {
                System.out.print("Te has quedado corto, ");
                x = x + 1;
            }

            System.out.print("Intentalo de nuevo ");
            respuesta = br.readLine();

        }

    }
}
