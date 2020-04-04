package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rs1 = " ";
        if ("Привет, Бот.".equals(question)) {
            System.out.println("Привет, умник");
        } else if ("Пока.".equals(question)) {
            System.out.println("До скорой встречи.");
        } else {
            System.out.println("Это ставит меня в тупик. Задайте другой вопрос.");
    }
    return rs1;
}
    public static void main(String[] args) {
        String ans1 = DummyBot.answer("Как живешь?");
        System.out.println(ans1);
}

}