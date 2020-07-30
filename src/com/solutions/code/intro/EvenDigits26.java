package com.solutions.code.intro;

public class EvenDigits26 {
    public static void main(String[] args) {
        int num = 248622;
        int num1 = 642386;
        int num2 = 48842;
        int num3 = 7468428;
        System.out.println(evenDigitsOnly(num)); //true
        System.out.println(evenDigitsOnly(num1)); //false
        System.out.println(evenDigitsOnly(num2)); //true
        System.out.println(evenDigitsOnly(num3)); //false
    }
    static boolean evenDigitsOnly(int n) {
        int i = 0;
        while (n > 0) {
            i = n % 10;
            if (i % 2 == 1) return false;
            else n = n / 10;
        }
        return true;
    }
}
