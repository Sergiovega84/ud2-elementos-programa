package com.sergio_vega;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
	//
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int z = 0;

        System.out.print("¿Cuantos valores hay que sumar?: ");
        int y = Integer.parseInt(br.readLine());

        for (int x = 0; x < y; x = x + 1) {

            System.out.print("Número: ");
            int n = Integer.parseInt(br.readLine());
            z += n;
        }
        System.out.println("El resultado es " + z);

    }
}
