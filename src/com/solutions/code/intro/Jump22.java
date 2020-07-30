package com.solutions.code.intro;

public class Jump22 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 7, 9};
        int[] arr2 = {2, 3};
        int[] arr3 = {1, 4, 10, 6, 2};
        int[] arr4 = {1000, 999};
        System.out.println(avoidObstacles(arr)); //4
        System.out.println(avoidObstacles(arr2)); //4
        System.out.println(avoidObstacles(arr3)); //7
        System.out.println(avoidObstacles(arr4)); //6
    }

    static int avoidObstacles(int[] inputArray) {
        int i = 1;
        int j = 0;
        while (j < inputArray.length) { //iterate through array
            if (inputArray[j] % i == 0) { //if true, iterate through the beginning of the array again and increment i
                i++;
                j = 0;
            } else j++;
        } return i;
    }
}