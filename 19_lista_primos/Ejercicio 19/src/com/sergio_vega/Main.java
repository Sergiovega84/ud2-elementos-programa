package com.sergio_vega;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe un número ");
        int x = Integer.parseInt(br.readLine());
        int y = 2;
        int z;

        for (int a = 0; a <= x; a++) {

            y = 2;
            do {
                z = a % y;
                y++;
            }
            while (a > y && z != 0);
            if (z != 0) {
                System.out.println(a);
            }

        }

    }
}