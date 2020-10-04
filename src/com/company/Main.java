package com.company;

public class Main {
    public static int main(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие
        else {
            System.out.print(n % 10 + " ");
            return main(n / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(main(123)); // вызов рекурсивной функции
    }
}