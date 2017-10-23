package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int x = 0;
	int y = 0;
	int z = 0;


        System.out.print("Introduzca número ");
        x = Integer.parseInt(br.readLine());
        for (y = 0; y < x; y = y + 1) {
            z = z + x;
        }
        System.out.print("El cuadrado de " +x+ " es " +z);

    }
}
