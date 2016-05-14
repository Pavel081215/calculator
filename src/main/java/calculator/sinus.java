package calculator;

/**
 * Created by Pavel on 14.05.2016.
 */
public class SInus implements ScientificCalculator {
    @Override
    public double ScientificCalculator(double variable) {
        return Math.sin(Math.toRadians(variable));
    }
}
