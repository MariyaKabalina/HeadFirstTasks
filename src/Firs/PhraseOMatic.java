package Firs;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListFirst = {"волшебный", "загадочный", "взаимный", "искренний", ",большой", "чистый", "любопытный",
                "опытный", "настройчивый", "умеренный", "самостоятельный", "открытый", "динамичный"};
        String[] wordListSecond = {"ориентированный", "всеобъемлющий", "фирменный", "многообразный", "природный",
                "материализованный", "ориентированный", "многозадачный"};
        String[] wordListThird = {"прогресс", "день", "намек", "вектор", "оператор", "разработчик", "программист", "наследник",
                "герой", "любовник", "риятель"};
        int firstLength = wordListFirst.length;
        int secondLength = wordListSecond.length;
        int thirdLendth = wordListThird.length;

        int rand1 = (int) (Math.random() * firstLength);
        int rand2 = (int) (Math.random() * secondLength);
        int rand3 = (int) (Math.random() * thirdLendth);

        String phrase = wordListFirst[rand1] + " " + wordListSecond[rand2] + " " + wordListThird[rand3];
        System.out.println("Все, что Вам нужно, - это" + " " + phrase);
    }
}

