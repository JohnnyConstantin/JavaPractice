package com.company;

class Main {
    public static String main(int n) {
        // Базовый случай
        if (n < 10) {
            return Integer.toString(n);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return main(n / 10) + " " + n % 10;
        }
    }
    public static void main(String[] args) {
        System.out.println(main(153)); // вызов рекурсивной функции
    }
}