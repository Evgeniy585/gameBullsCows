package com.bulls_cows;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;



public class generateNum {

        public static ArrayList<Integer> result;

        public static ArrayList<Integer> getListNum() {
                return result;
        }
        public <lineInteger> void setListNum(){
                this.result = result;
        }

        public static void main(String[] args) {
                ArrayList<Integer> numbers = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                        numbers.add(i);
                }

                Collections.shuffle(numbers);

                ArrayList<Integer> result = new ArrayList<>();
                for (int i = 0; i < 4; i++) {
                        result.add(Integer.valueOf(numbers.get(i).toString())); //Загаданное число
                }

        }
}



