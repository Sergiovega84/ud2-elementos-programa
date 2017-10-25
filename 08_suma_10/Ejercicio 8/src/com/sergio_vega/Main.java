package com.sergio_vega;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	//
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        for (int y = 0; y < 10; y++) {
            System.out.print("Introduce valor ");
            int z = Integer.parseInt(br.readLine());
            x += z;
        }
        System.out.print("El valor total es " +x);

    }
}
