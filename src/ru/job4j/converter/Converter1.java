package ru.job4j.converter;

public class Converter1 {
            public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

        public static int rubleToDollar(int value) {
            int rs2 = value / 60; // формула перевода рублей в доллоры.
            return rs2;
        }

        public static void main(String[] args) {
            int in = 140;
            int expected = 2;
            int out = rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2. Test result :" + passed);
        }

    }

