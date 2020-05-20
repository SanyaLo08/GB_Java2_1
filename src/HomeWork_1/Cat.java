package HomeWork_1;

import java.util.Random;

public class Cat {
    private static int j, r;

    public static void jump() {
        Random rnd = new Random();
        j = 1 + rnd.nextInt(2);
        System.out.println("Кот прыгнул на " + j + " метр(а)");
        Wall w1 = new Wall();
        w1.Height(j);
    }
    public static void running() {
        Random rnd = new Random();
        r = 1 + rnd.nextInt(800);
        System.out.println("Кот пробежал, аж " + r + " метров");
        Treadmill r1 = new Treadmill();
        r1.distance(r);
    }
    public static void main(String[] args) {
        jump();
        running();
        Wall w1 = new Wall();
        w1.Height(j);
        Treadmill d = new Treadmill();
        d.distance(r);
    }


}
