package com.bulls_cows;

import java.util.List;
import java.util.ArrayList;

public class Bulls_and_Cows {
    static int bulls = 0;
    static int cows = 0;
    userAnswer answer = new userAnswer();
    generateNum genNum = new generateNum();
    public static void main(String[] args) {

        ArrayList<Integer> lineInteger = userAnswer.getList();
        ArrayList<Integer> result = generateNum.getListNum();

        for (int i = 0; i <= result.size(); i++) {

            for (int j = 0; j <= lineInteger.size(); j++) {
                if (result.get(i) == lineInteger.get(j)) {
                    if (i == j) {
                        bulls++;
                    } else {
                        cows++;
                    }
                }
            }

        }
        if (bulls == 4) {
            System.out.println("Молодец,ты угадал! Это число" + lineInteger);
        } else {
            System.out.println("Не угадал. Быки: " + bulls + ". Коровы: " + cows + ".");
        }
    }
}





