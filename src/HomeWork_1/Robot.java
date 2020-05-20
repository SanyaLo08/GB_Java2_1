package HomeWork_1;

import java.util.Random;

public class Robot {
    private static int j, r;

    public static void jump(){
        Random rnd = new Random();
        j = 0 + rnd.nextInt(1);
        System.out.println("Робот прыгнул на " + j + " метр(ов)");
        Wall w1 = new Wall();
        w1.Height(j);
    }
    public static void running(){
        Random rnd = new Random();
        r = 1000 + rnd.nextInt(30000);
        System.out.println("Робот смог пробежать " + r + " метров");
        Treadmill d = new Treadmill();
        d.distance(r);
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
