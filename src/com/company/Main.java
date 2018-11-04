package com.company;

public class Main {

    public static void main(String[] args) {
        String symbols = "Si,mep[nyuk";
        String secondName = "Semenyuk";
        int temp = 0;
        boolean isTrue = false;


        for (int i = 0; i < symbols.length(); i++) {
            for (int j = 0; j < secondName.length(); j++) {
                if (symbols.charAt(i) == secondName.charAt(j)) {
                    temp++;
                    if (temp >= secondName.length()) isTrue = true;
                }
            }
        }
        System.out.println(isTrue);
    }
}