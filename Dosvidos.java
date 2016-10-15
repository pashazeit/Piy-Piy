package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dosvidos {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = " ";

        while ( !(s.equals ("пока")))
        {
          s = reader.readLine();
            System.out.println(s);
        }

            System.out.println("досвидос");

        // write your code here
    }
}
