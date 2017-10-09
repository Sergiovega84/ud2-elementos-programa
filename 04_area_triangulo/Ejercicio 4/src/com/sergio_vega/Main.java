package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	//
        double a = 0;
        double b = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("indroduce base ");
        a = Double.parseDouble(br.readLine());

        System.out.print("introduce altura ");
        b = Double.parseDouble(br.readLine());

        double x = (a * b) / 2;

        System.out.print("el área del triangulo es " +x );

    }
}
