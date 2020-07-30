package com.solutions.code.intro;

public class IPV21 {
    public static void main(String[] args) {
        String str = "172.16.254.1";
        String str2 = "172.316.254.1";
        String str3 = ".254.255.0";
        String str4 = "0.254.255.0";
        String str5 = "1.1.1.1a";
        String str6 = "129380129831213981.255.255.255";
        System.out.println(isIPv4Address(str)); //true
        System.out.println(isIPv4Address(str2)); //false
        System.out.println(isIPv4Address(str3)); //false
        System.out.println(isIPv4Address(str4)); //true
        System.out.println(isIPv4Address(str5)); //false
        System.out.println(isIPv4Address(str6)); //false
    }

    static boolean isIPv4Address(String inputString) {
        if (inputString.matches(".*[a-zA-Z]+.*")) return false;
        String[] parts = inputString.split("\\.");
        int i = 0;
        if (parts.length != 4) return false;
            while (i < parts.length) {
                if (parts[i].length() == 0 || parts[i].length() > 3) return false;
                else {
                    int result = Integer.parseInt(parts[i]);
                    if (result >= 0 && result < 10) { //if number is between 0-9 (inclusive) then it should have a length of 1
                        if (parts[i].length() != 1) return false;
                    } else if (result >= 10 && result < 100) { //if number is between 10-99 (inclusive) then it should have a length of 2
                        if (parts[i].length() != 2) return false;
                    } else if (result >= 100 && result <= 255) { //if number is 100 or greater but less than 255, then length should be 3
                        if (parts[i].length() != 3) return false;
                    } else return false;
                    i++;
                }
            } return true;
    }
}


