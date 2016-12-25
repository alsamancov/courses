package com.mysite.goit.Modul02;

import java.util.Arrays;

/**
 * Created by Alexey on 12/25/2016.
 */
public class Main {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sum(array));
        double [] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.1};
        System.out.println(sum(doubleArray));

        System.out.println(min(array));
        System.out.println(min(doubleArray));
    }

    public static int sum(int[] array){
        int result = 0;
        for(int i = 0; i < array.length; i++){
            result += array[i];
        }
        return result;

    }

    public static double sum(double[] doubleArray){
        double result = 0;
        for(int i = 0; i < doubleArray.length; i++){
            result += doubleArray[i];
        }
        return  result;
    }

    public static int min(int[] array){
        int result = 0;
        Arrays.sort(array);
        result = array[0];
        return result;
    }

    public static double min(double[] array){
        double result = 0;
        Arrays.sort(array);
        result = array[0];
        return result;
    }

}
