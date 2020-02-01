package com.company;


import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) {


        String[] names = {"Бекзат", "Эрлан", "Баяман"};
        names = Arrays.copyOf(names, names.length + 1);

        names[3] = "Мастер";
        for (String s : names) {
            switch (s) {
                case "Бекзат":
                    System.out.println(s + " доброе утро ");
                    break;
                case "Эрлан":
                    System.out.println(s + " Хорошего дня ");
                    break;
                case "Баяман":
                    System.out.println(s + " Хорошего вечера ");
                    break;
                case "Мастер":
                    System.out.println(s + " Досвидание ");
                    break;
            }
        }


    }
}



