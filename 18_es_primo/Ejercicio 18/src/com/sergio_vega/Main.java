package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("introducca número: ");
        int x = Integer.parseInt(br.readLine());
        int y = 2;
        int z;

        do {
            z = x % y;
            y++;
        } while (y < x && z != 0);
        if (z != 0) {
            System.out.println("el número " +x+ " es primo");
        }
        if (z == 0) {
            System.out.println("el número " +x+ " no es primo");
        }


    }
}
