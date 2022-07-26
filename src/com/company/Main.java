package com.company;


public class Main {

    public static void main(String[] args){

        int[] array = {45,785,22,48, -5, -3, 22, 15, -33, 9, -6, -43, 35, 11, -18, 44, 89, 23, -53};

        double sum = 0;
        for (int i : array) {
            if (i > 0)
                sum += i;
        }
        double countPlus = 0;// ЭТО ИЗМЕНЕНИЯ (Кстати я добавил числа 22 и 48 вначале)!!!!!!!!!!!!!!!!!!!
        int j = 0;
        for (int h :array) {
            if (h < 0) { // Это полож. числа которые ДО первого отриц  (22,48).!!
                break;
            }
                if (h > 0) { // Это сколько ИХ полож. ДО первого отриц  (2).
                    countPlus++;
                }

            j += h; // Здесь я плюсовал ВСЕ полож. числа ДО первого отриц (22+48).

    }
        double len = countPositives(array) - countPlus;// Здесь я минусовал ВСЕ полож.числа и числа ДО первого отриц!!!!
        double newSum = sum - j;// Тоже самое что и числа    (СУММА!!!!)
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

