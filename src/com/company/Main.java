package com.company;

public class Main {

    public static void main(String[] args) {
        double[] money = {100_000, 110_000, 120_000, 131.125, 140_000, 150_000, 160_000, 170_000, 183.050, 190.365, 200_000};
        double sum = 0;
        for (double i = 0; i < 30; i++) {
            sum += money[1];
            System.out.println("cумма за день " + sum);

        }
        System.out.println("sum = " + sum);
        double minimalSum = -1;
        for (int i = 0; i < money.length; ) {
            {
                if (money[i] > minimalSum) {
                    minimalSum = money[0];
                    System.out.println("minimalSum = " + minimalSum);
                }

            }double maximumSum = -1;
            for (int i1 = 0; i < money.length; ) {
                if (money[i] > maximumSum) {
                    maximumSum = money[10];
                    System.out.println("maximumSum = " + maximumSum);
                    int month = 30;
                    System.out.println("средняя сумма трат за месяц " + sum/month);


                }

            }
        }
    }
}







