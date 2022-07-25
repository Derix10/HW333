package com.company;


public class Main {

    public static void main(String[] args){

        int[] array = {22,48, -5, -3, 22, 15, -33, 9, -6, -43, 35, 11, -18, 44, 89, 23, -53};

        double sum = 0;
        for (int i : array) {
            if (i > 0)
                sum += i; // сумма всех положительных
        }
        double countPlus = 0;
        int j = 0;
        for (int h :array) {
            if (h < 0) {
                break;
            }
                if (h > 0) {
                    countPlus++;
                }

            System.out.println(countPlus);
            j += h;

    }
        double len = countPositives(array) - countPlus;
        double newSum = sum - j;
        System.out.println("Среднее арифметическое:" + newSum / len); // среднее арифметическое: 31 (можете изменить чиcла)

    }

    public static int countPositives(int[] array){
        int count = 0;
        for (int i: array){
            if (i > 0){
                count++;
            }
        }
        return count;
    }
}

