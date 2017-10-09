package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce número ");
        double x = Double.parseDouble(br.readLine());

        if (0 == x % 2) {
            System.out.print( +x+ " es un número par ");
        } else {
            System.out.print(+x+ " es un número es impar ");
        }

    }
}
