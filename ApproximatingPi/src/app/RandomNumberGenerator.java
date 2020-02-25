package app;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {

    static ThreadLocalRandom ThreadLocal = ThreadLocalRandom.current();
    
    public static double rand(double min, double max) {
        if (min > max) {
            throw new IllegalArgumentException("Min is smaller than max");
        }
        return ThreadLocal.nextDouble(min, max);
    }

    public static int rand(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min is smaller than max");
        }
        return ThreadLocal.nextInt(min, max);
    }
}