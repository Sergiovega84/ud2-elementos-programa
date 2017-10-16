package com.sergio_vega;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
	//
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int contador = 0;
        int resultado = 0;
        int x = 0;
        System.out.print("Introduce número de valores a sumar: ");
        int y = Integer.parseInt(br.readLine());
        do {
            System.out.print("Escribe valor: ");
            x = Integer.parseInt(br.readLine());
                contador = contador + 1;
                resultado = resultado + x;
        } while (contador < y);
        System.out.println("El resultado es: " +resultado);

    }
}
