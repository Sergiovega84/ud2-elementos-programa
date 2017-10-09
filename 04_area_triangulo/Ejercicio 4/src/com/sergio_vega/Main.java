package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	//
        int a = 0;
        int b = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("indroduce base ");
        a = Integer.parseInt(br.readLine());

        System.out.print("introduce altura ");
        b = Integer.parseInt(br.readLine());

        int x = (a + b) / 2;

        System.out.print("el área del triangulo es " +x );

    }
}
