package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Escribe P para par o I para impar ");
        char x = br.readLine().toUpperCase().charAt(0);

        while (x != 'P' && x != 'I') {
            System.out.print("Introduce P o I ");
            x = br.readLine().toUpperCase().charAt(0);
        }

        // seguro que es p o i

        if (x == 'P') {
            System.out.println("Esta es la lista de los 100 primeros números pares");
            int y = 0;
            while (y <= 200) {
                System.out.println(+y );
                y = y + 2;
            }
        } else {
            System.out.println("Esta es la lista de los 100 primeros números impares");
            int y = 1;
            while (y < 200) {
                System.out.println(+y );
                y = y + 2;
            }
        }


    }
}
