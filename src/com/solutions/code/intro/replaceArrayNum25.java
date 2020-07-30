package com.solutions.code.intro;

import java.util.Arrays;

public class replaceArrayNum25 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 1, 1};
        System.out.println(Arrays.toString(arrayReplace(arr, 1, 3))); //[3, 2, 3]
        System.out.println(Arrays.toString(arrayReplace(arr2, 3, 0))); //[1, 2, 0, 4, 5]
        System.out.println(Arrays.toString(arrayReplace(arr3, 1, 10))); //[10, 10, 10]
    }

    static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace) {
                inputArray[i] = substitutionElem;
            }
        } return inputArray;
    }
}

//iterate thru arrayE
//find the element
//replace
//return