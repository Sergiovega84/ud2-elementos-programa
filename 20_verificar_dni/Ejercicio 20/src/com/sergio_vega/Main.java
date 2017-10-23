package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int x = 0;
	    boolean verificado = false;
	    boolean correcto;

        while (x == 0) {
            System.out.print("Introduzca número de DNI sin letra ");
            x = Integer.parseInt(br.readLine());
            if (x < 1 || x > 99999999) {
                System.out.println("El número introducido no es válido. vuelva a intentarlo");
                x = 0;
            }
        }
        do {
            System.out.print("Introduzca letra ");
            String letra = br.readLine();
            letra = letra.toLowerCase();
            correcto = true;
            switch (letra) {
                case "t":
                    if (x % 23 == 0) {
                        verificado = true;
                    }
                    break;
                case "r":
                    if (x % 23 == 1) {
                    verificado = true;
                    }
                    break;
                case "w":
                    if (x % 23 == 2) {
                    verificado = true;
                    }
                    break;
                case "a":
                    if (x % 23 == 3) {
                    verificado = true;
                    }
                    break;
                case "g":
                    if (x % 23 == 4) {
                    verificado = true;
                    }
                    break;
                case "m":
                    if (x % 23 == 5) {
                    verificado = true;
                    }
                    break;
                case "y":
                    if (x % 23 == 6) {
                    verificado = true;
                    }
                    break;
                case "f":
                    if (x % 23 == 7) {
                    verificado = true;
                    }
                    break;
                case "p":
                    if (x % 23 == 8) {
                    verificado = true;
                    }
                    break;
                case "d":
                    if (x % 23 == 9) {
                    verificado = true;
                    }
                    break;
                case "x":
                    if (x % 23 == 10) {
                    verificado = true;
                    }
                    break;
                case "b":
                    if (x % 23 == 11) {
                    verificado = true;
                    }
                    break;
                case "n":
                    if (x % 23 == 12) {
                    verificado = true;
                    }
                    break;
                case "j":
                    if (x % 23 == 13) {
                    verificado = true;
                    }
                    break;
                case "z":
                    if (x % 23 == 14) {
                    verificado = true;
                    }
                    break;
                case "s":
                    if (x % 23 == 15) {
                    verificado = true;
                    }
                    break;
                case "q":
                    if (x % 23 == 16) {
                    verificado = true;
                    }
                    break;
                case "v":
                    if (x % 23 == 17) {
                    verificado = true;
                    }
                    break;
                case "h":
                    if (x % 23 == 18) {
                    verificado = true;
                    }
                    break;
                case "l":
                    if (x % 23 == 19) {
                    verificado = true;
                    }
                    break;
                case "c":
                    if (x % 23 == 20) {
                    verificado = true;
                    }
                    break;
                case "k":
                    if (x % 23 == 21) {
                    verificado = true;
                    }
                    break;
                case "e":
                    if (x % 23 == 22) {
                    verificado = true;
                    }
                    break;
                default:
                    break;
            }
        } while (!correcto);
        if (verificado) {
            System.out.print("DNI verificado ");
        } else {
            System.out.print("DNI incorrecto ");
        }
    }
}
