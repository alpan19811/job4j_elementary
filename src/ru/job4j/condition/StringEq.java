package ru.job4j.condition;

public class StringEq {
    public static void main(String[] args) {
        String root = new String("one");
        String login = new String("one");
        if (root.equals(login)) {
            System.out.println("root equals login");
        } else {
            System.out.println("root does not equal login");
        }
    }

}