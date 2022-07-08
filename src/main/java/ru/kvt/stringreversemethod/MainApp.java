package ru.kvt.stringreversemethod;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        StringBuilder s = new StringBuilder(in.nextLine());
        System.out.println(s);
        System.out.println(s.reverse());
        final long timeFor1000 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            s.reverse();
        }
        System.out.println(System.currentTimeMillis() - timeFor1000);
        final long timeFor10000 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s.reverse();
        }
        System.out.println(System.currentTimeMillis() - timeFor10000);
        final long timeFor100000 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s.reverse();
        }
        System.out.println(System.currentTimeMillis() - timeFor100000);
    }

}
