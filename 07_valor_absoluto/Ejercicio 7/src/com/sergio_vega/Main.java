package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
	//
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x;
        do{
            System.out.print("Introduce valor: " );
            x = Integer.parseInt(br.readLine());
            if (x < 0) {
                int y = x * -1;
                System.out.println("El valor absoluto es: " +y);
            } else if (x > 0) {
                System.out.println("El valor absoluto es: " +x);
            } else {
                // 0
            }
        } while (x != 0);
    }
}
