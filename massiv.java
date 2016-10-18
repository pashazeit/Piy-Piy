package com.company;
/**
 * Created by Zeit on 17.10.2016.
 */
public class massiv {
   public static void main(String[] args) {
        int a = 100000;
        int[] num = new int[100];

        for (int i = 0; i < num.length - 1; i++) {
            num[i] = (int) ((Math.random() * a));
        }

        for (int i : num) {
            System.out.print(i + " ");
        }


        boolean sort = false;
        while (!sort) {

            sort = true;

            for (int i = 0; i < num.length - 1; i++) {

                if (num[i] > num[i + 1]) {

                    int temp = num[i];

                    num[i] = num[i + 1];
                    num[i + 1] = temp;

                    sort = false;
                }
            }
        }
        System.out.println();
        System.out.println("сортированный   массив");
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("min: " + num[0] + " maximum: " + num[num.length - 1]);
    }

}
