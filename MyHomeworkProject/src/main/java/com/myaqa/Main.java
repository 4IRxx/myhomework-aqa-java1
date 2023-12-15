package com.myaqa;

public class Main {

    public static void main(String[] args) {
        //Основной класс в главной ветке, источник ветвления
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 6;
        int b = 9;

        System.out.println((a + b >= 0) ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 1995;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 9;

        System.out.println((a >= b) ? "a >= b" : "a < b");
    }
}