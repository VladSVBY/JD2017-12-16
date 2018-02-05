package by.it.sendetskaya.jd02_01;

import java.util.Random;

public class Helper {
    private final static Random random=new Random();

    static int getRandom(int max)
    {
        return random.nextInt(max);
    }

    private static int getRandom(int start, int stop)
    {
        return start+random.nextInt(stop-start);
    }

    static void sleep(int start, int stop) {
        try {
            Thread.sleep(Helper.getRandom(start,stop));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
