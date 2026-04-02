package com.itvdn.javaEssential.ex001_exceptions;

/**
 * Обробка винятків.
 */
public class Main {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            // Спроба поділу на нуль.
            a = a / (2 - n);

            System.out.println("a = " + a);
        } catch (Exception e) {
            System.out.println("Обробка виключення.");
            System.out.println(e.getMessage());
        }
    }
}
