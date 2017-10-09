package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        int x = 0;
        int a = 0;
        int b = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introducir valor ");
        a = Integer.parseInt(br.readLine());

        System.out.print("introducir segundo valor ");
        b = Integer.parseInt(br.readLine());

        x = a * b;
        System.out.println(x);

    }
}
