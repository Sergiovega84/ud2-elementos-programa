package com.sergio_vega;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	//
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe primer valor: ");
        int x1 = Integer.parseInt(br.readLine());
        System.out.print("Escribe segundo valor: ");
        int x2 = Integer.parseInt(br.readLine());
        System.out.print("Escribe tercer valor: ");
        int x3 = Integer.parseInt(br.readLine());
        System.out.print("Escribe cuarto valor: ");
        int x4 = Integer.parseInt(br.readLine());
        System.out.print("Escribe quinto valor: ");
        int x5 = Integer.parseInt(br.readLine());
        System.out.print("Escribe sexto valor: ");
        int x6 = Integer.parseInt(br.readLine());
        System.out.print("Escribe septimo valor: ");
        int x7 = Integer.parseInt(br.readLine());
        System.out.print("Escribe octvo valor: ");
        int x8 = Integer.parseInt(br.readLine());
        System.out.print("Escribe noveno valor: ");
        int x9 = Integer.parseInt(br.readLine());
        System.out.print("Escribe décimo valor: ");
        int x10 = Integer.parseInt(br.readLine());
        int x = x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10;

        System.out.print("El valor total es: " +x);

    }
}
