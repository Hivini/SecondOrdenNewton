public class SecondOrderNewton {
    private int[] coefficients;
    private int[] derivativeCoefficients;
    private int[] secondDerivativeCoefficients;
    private double tolerance;
    private double maxIter;
    private double initialValue;

    public SecondOrderNewton(String expression) {
        this(expression, Utils.TOLERANCE, Utils.MAX_ITER, Utils.INITIAL_VALUE);
    }

    public SecondOrderNewton(String expression, double tolerance, int maxIter, double initialValue) {
        String[] stringCoefficients = expression.split("x\\^\\d+\\+?");
        this.coefficients = new int[stringCoefficients.length];
        for (int i = 0; i < stringCoefficients.length; i++) {
            this.coefficients[i] = Integer.parseInt(stringCoefficients[i]);
        }
        this.derivativeCoefficients = Utils.derivative(this.coefficients);
        this.secondDerivativeCoefficients = Utils.derivative(this.derivativeCoefficients);
        this.tolerance = tolerance;
        this.maxIter = maxIter;
        this.initialValue = initialValue;
    }

    public double calculate() {
        int iterCount = 0;
        double xi = this.initialValue;
        double previousXi;
        double deltaX;
        do {
            deltaX = getChange(Utils.getXValue(coefficients, xi),
                    Utils.getXValue(derivativeCoefficients, xi),
                    Utils.getXValue(secondDerivativeCoefficients, xi));
            previousXi = xi;
            xi += deltaX;
        } while (getNormalizedError(xi, previousXi) > this.tolerance && this.maxIter > iterCount);
        return xi;
    }

    private double getChange(double value, double derivativeValue, double secondDerivativeValue) {
        return 1.0 / (-(derivativeValue/value) + (1.0/2.0) * (secondDerivativeValue/derivativeValue));
    }

    private double getNormalizedError(double xi, double deltaX) {
        return Math.abs((deltaX - xi) / xi);
    }
}
