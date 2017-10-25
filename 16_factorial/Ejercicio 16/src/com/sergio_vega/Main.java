package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int x;
	int y = 1;


        System.out.print("Introduzca valor ");
        x = Integer.parseInt(br.readLine());
        for (int z = 1; z <= x; z++) {
            y = y * z;
        }
        System.out.println("El resultado es " +y);

    }
}
