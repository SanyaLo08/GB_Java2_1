package HomeWork_1;

import java.util.Random;

public class Treadmill {

    Random rnd = new Random();

    public void distance (int r) {
        int d;
        d = 1 + rnd.nextInt(r + r / 2);
        if (r >= d) {
            System.out.println("Преодолел дистанцию в " + d + " метров");
        } else {
            System.out.println("Не преодолел дистанцию в " + d + " метров");
        }
    }
}

