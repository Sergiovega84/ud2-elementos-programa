package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce valor en grados Celsius (ºC): ");
        double x = Double.parseDouble(br.readLine());
        System.out.print("Introfuce unidad a la que quiereas convertir (F o K): ");
        char y = br.readLine().charAt(0);

        if (y == 'F') {
            x = x * 1.8 + 32;
            System.out.print("El resultado en grados Fahrenheit es: " + x);
        } else {
            if (y == 'K') {
                x = x + 273.15;
                System.out.print("El resultado en grados Kelvin es: " + x);
            } else {
                    System.out.print("Debes introducir F o K");
                }
            }
        }
    }