package HomeWork_1;

import java.util.Random;

public class Wall {
    Random rnd = new Random();
    public void Height(int j) {
        int w1;
        w1 = 1 + rnd.nextInt(j + j / 2);
        if (j >= w1) {
            System.out.println("Преодолел препятствие в " + w1 + " метра(ов)");
        } else {
            System.out.println("Не преодолел препятствие в " + w1 + " метра(ов)");
        }
    }
}
