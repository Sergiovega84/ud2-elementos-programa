package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	//
        int a = 0;
        int b = 0;
        int c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("introducir primer valor ");
        a = Integer.parseInt(br.readLine());

        System.out.print("introducir segundo valor ");
        b = Integer.parseInt(br.readLine());

        System.out.print("introducir tercer valor ");
        c = Integer.parseInt(br.readLine());

        System.out.print(+c+ ", " +b+ ", " +a);
    }
}
