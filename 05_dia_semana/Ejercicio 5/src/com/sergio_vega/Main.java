package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	//

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("introducir valor del día de la semana ");
        int x = Integer.parseInt(br.readLine());

        if (x >= 1 && x <= 7) {

            switch (x) {
                case 1:
                    System.out.print("Lunes");
                    break;
                case 2:
                    System.out.print("Martes ");
                    break;
                case 3:
                    System.out.print("Miércoles ");
                    break;
                case 4:
                    System.out.print("Jueves ");
                    break;
                case 5:
                    System.out.print("Viernes ");
                    break;
                case 6:
                    System.out.print("Sábado ");
                    break;
                case 7:
                    System.out.print("Domingo ");
                    break;

            }

        } else {
            System.out.print("Número introducido incorrecto ");

        }


    }
}
