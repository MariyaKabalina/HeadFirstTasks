package ClassAndObjects;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");

        while(true) {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            int guessp1 = p1.number;
            System.out.println("Первый игрок ддумает, что это " + guessp1);

            int guessp2 = p2.number;
            System.out.println("Второй игрок ддумает, что это " + guessp2);

            int guessp3 = p3.number;
            System.out.println("Третий игрок ддумает, что это " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + " " + p1isRight);
                System.out.println("Второйй игрок угадал?" + " " + p2isRight);
                System.out.println("Третий игрок угадал?" + " " +  p3isRight);
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("Игроки должны поробовать еще раз");
            }
        }
    }
}
