package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce número ");
        int x = Integer.parseInt(br.readLine());

        if (x % 2 == 0) {
            System.out.print( +x+ " es un número par ");
        } else {
            System.out.print(+x+ " es un número es impar ");
        }

    }
}
