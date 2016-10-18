package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Zeit on 17.10.2016.
 */
public class massiv2for {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 10000;
        int[] mass = new int[100];

        for (int i = 0; i < 100; i++)
        {
            mass[i] = ((int) (Math.random() * max));
        }

        for (int i = mass.length - 1; i > 0; i--)

            for (int p = 0; p < i; p++)
            {
                if (mass[p] > mass[p + 1])
                {
                    int temp = mass[p];
                    mass[p] = mass[p + 1];
                    mass[p + 1] = temp;
                }
            }

        for (int i = 0; i < mass.length; i++)
        {
            System.out.print(mass[i] + " ");
        }
    }
}

