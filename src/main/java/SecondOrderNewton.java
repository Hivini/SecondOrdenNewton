public class SecondOrderNewton {
    private int[] coefficients;
    private double tolerance;
    private double maxIter;

    public SecondOrderNewton(String expression) {
        this(expression, Utils.TOLERANCE, Utils.MAX_ITER);
    }

    public SecondOrderNewton(String expression, double tolerance, int maxIter) {
        String[] stringCoefficients = expression.split("x\\^\\d+\\+?");
        this.coefficients = new int[stringCoefficients.length];
        for (int i = 0; i < stringCoefficients.length; i++) {
            this.coefficients[i] = Integer.parseInt(stringCoefficients[i]);
        }
        this.tolerance = tolerance;
        this.maxIter = maxIter;
    }

    public double calculate() {
        return 0;
    }
}
