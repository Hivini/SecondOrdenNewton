public class Utils {
    public static final int MAX_ITER = 20;
    public static final double TOLERANCE = 0.01;

    public static int[] derivative(int[] coefficients) {
        if (coefficients.length == 1) {
            return new int[]{0};
        }
        int[] derivativeCoefficients = new int[coefficients.length-1];
        for (int i = 0; i < coefficients.length-1; i++) {
            derivativeCoefficients[i] = coefficients[i] * (coefficients.length - 1 - i);
        }
        return derivativeCoefficients;
    }
}
