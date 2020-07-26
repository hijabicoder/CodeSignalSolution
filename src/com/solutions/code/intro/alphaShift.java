package com.solutions.code.intro;

public class alphaShift {
    public static void main(String[] args) {
        String str = "crazy";
        String str2 = "z";
        String str3 = "codesignal";
        System.out.println(alphabeticShift(str)); //"dsbaz"
        System.out.println(alphabeticShift(str2)); //"a"
        System.out.println(alphabeticShift(str3)); //"dpeftjhobm"
    }

    static String alphabeticShift(String inputString) {
        int charValue;
        String next;
        String[] shift = new String[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            charValue = inputString.charAt(i);
            if (charValue == 122) {
                next = String.valueOf((char) (97));
            } else {
                next = String.valueOf((char) (charValue + 1));
            }
            shift[i] = next;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shift.length; i++) {
            sb.append(shift[i]);
        }

        String newString = sb.toString();
        return newString;
    }
}
