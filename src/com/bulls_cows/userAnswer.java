package com.bulls_cows;

import java.util.ArrayList;
import java.util.Scanner;

public class userAnswer {

    public static ArrayList<Integer> lineInteger;
    public static ArrayList<Integer> getList(){
        return lineInteger;
    }
    public <lineInteger> void setList(){
        this.lineInteger = lineInteger;
    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String num = scanner.nextLine();

        ArrayList<Integer> lineInteger = new ArrayList<>();
        for (int i = 0; i < num.length(); i++) {
            lineInteger.add(Integer.valueOf(String.valueOf(num.charAt(i))));
        }
        System.out.println("Вы ввели: " + lineInteger);

    }
}

