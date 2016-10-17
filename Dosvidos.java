package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dosvidos {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = " ";

        while ( !(text.equals ("пока")))
        {
          text = reader.readLine();
            System.out.println(text);
        }

            System.out.println("досвидос");

        // write your code here
    }
}
