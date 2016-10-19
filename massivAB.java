package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Collections;

/**
 * Created by Zeit on 18.10.2016.
 */
public class massivAB {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 100;
        int[] mass = new int[10];

        for (int i = 0; i < 10; i++)
        {
            mass[i] = ((int) (Math.random() * max));
        }

        for (int i = mass.length - 1; i > 0; i--)
        {
            for (int p = 0; p < i; p++)
            {
                if (mass[p] > mass[p + 1])
                {
                  mass[p] = mass[p] + mass[p+1];
                    mass[p+1] = mass[p] - mass[p+1];
                    mass[p] = mass[p] - mass[p+1];

                 //   int temp = mass[p];

                  //  mass[p] = mass[p + 1];
                  //  mass[p + 1] = temp;
                }
            }
        }

        for (int i = 0; i < mass.length; i++)
        {
            System.out.print(mass[i] + " ");
        }
    }
}