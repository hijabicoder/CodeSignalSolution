package com.solutions.code.intro;

public class strongArms19 {
    public static void main(String[] args) {
        System.out.println(areEquallyStrong(10, 15, 15, 10)); //true
        System.out.println(areEquallyStrong(15, 10, 15, 10)); //true
        System.out.println(areEquallyStrong(15, 10, 15, 9)); //false
        System.out.println(areEquallyStrong(5, 5, 10, 10)); //false
    }

    static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        if (yourLeft != friendsLeft) {
            if (yourLeft != friendsRight) return false;
        }
        if (yourRight != friendsLeft) {
            if (yourRight != friendsRight) return false;
        }
        return true;
    }
}
