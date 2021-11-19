package com.company;

import java.util.Random;


        public class Main {

            public static void main(String[] args) {

                int[] massif = new int[20];
                Random number = new Random();
                for (int i = 0; i < 20; i++) {
                    massif[i] = number.nextInt(100+1);
                    System.out.println(massif[i]);
                }
                int sum = summa(massif);
                System.out.println("\n Сумма элементов массива - " +  sum);

                if (sum % 2 == 0) {
                    System.out.println("\n" + "ЧЁТНО");
                }
                else {
                    System.out.println("\n" + "НЕЧЁТНО");
                }

            }

            public static int summa(int[] array)
            {
                int sum = 0;
                for (int i = 0; i < 20; i++) {
                    sum = sum + array[i];
                }
                return(sum);
            }
        }

