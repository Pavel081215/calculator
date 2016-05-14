package calculator;

/**
 * Created by Pavel on 14.05.2016.
 */
public class Sinus implements ScientificCalculator {
    @Override
    public double ScientificCalculator(double variable) {
        return Math.sin(Math.toRadians(variable));
    }
}
