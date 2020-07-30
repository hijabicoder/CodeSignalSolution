package com.solutions.code.intro;

public class MaxAdj20 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 0};
        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = {-1, 4, 10, 3, -2};
        int[] arr4 = {-14, 15, -15};
        System.out.println(arrayMaximalAdjacentDifference(arr)); //3
        System.out.println(arrayMaximalAdjacentDifference(arr2)); //0
        System.out.println(arrayMaximalAdjacentDifference(arr3)); //7
        System.out.println(arrayMaximalAdjacentDifference(arr4)); //30
    }

    static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int finalInt;
        int greatestIndex = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > inputArray[greatestIndex]) greatestIndex = i;
        }
        if (greatestIndex == 0) {
            finalInt = inputArray[0] - inputArray[1];
        }
        else if (greatestIndex == inputArray.length - 1) {
            finalInt = inputArray[greatestIndex] - inputArray[greatestIndex - 1];
        }
        else {
            if (inputArray[greatestIndex - 1] > inputArray[greatestIndex + 1]) {
                finalInt = inputArray[greatestIndex] - inputArray[greatestIndex + 1];
            } else {
                finalInt = inputArray[greatestIndex] - inputArray[greatestIndex - 1];
            }
        }
        return finalInt;
    }
}
