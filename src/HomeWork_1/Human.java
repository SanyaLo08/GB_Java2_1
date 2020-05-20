package HomeWork_1;

import java.util.Random;

public class Human {
    private static int j, r;

    public static void jump() {
        Random rnd = new Random();
        j = 2 + rnd.nextInt(5);
        System.out.println("Человек прыгнул на " + j + " метра(ов)");
        Wall w1 = new Wall();
        w1.Height(j);
    }

    public static void running() {
        Random rnd = new Random();
        r = 1000 + rnd.nextInt(21000);
        System.out.println("Человек смог пробежать " + r + " метров");
        Treadmill r1 = new Treadmill();
        r1.distance(r);
    }

    public static void main(String[] args) {
        jump();
        running();
        Wall w1 = new Wall();
        w1.Height(j);
        Treadmill r1 = new Treadmill();
        r1.distance(r);
    }

}