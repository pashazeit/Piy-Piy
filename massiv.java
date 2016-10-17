package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Zeit on 17.10.2016.
 */
public class massiv {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = 1;
        int max = 100;
        int[] mass = new int[5];
        for (int i = 0; i < 5; i++) {
            mass[i] = ((int) (Math.random() * max));
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}
