package app;

public class ApproximatingPi {

    double total = 0;
    double circle = 0;
    double radius = 100;
    double builtinPi = Math.PI;
    double bestError = Double.POSITIVE_INFINITY;
    public double PI = Double.POSITIVE_INFINITY;
    public int iteration = 0;

    public ApproximatingPi () {
        
    }

    public void update() {
        double x = RandomNumberGenerator.rand(-radius, radius);
        double y = RandomNumberGenerator.rand(-radius, radius);
        double distance_squared = x*x + y*y;
        total++; iteration++;
        if (distance_squared < radius * radius) {
            circle ++;
        }
    }

    public boolean isBestToDate() {
        double currentPi = 4*circle/total;
        double currentError = Math.abs(builtinPi-currentPi);
        if (currentError < bestError) {
            bestError = currentError;
            PI = currentPi;
            return true;
        }
        return false;
    }
}