
public class SecondOrderNewton {
    private int[] coefficients;

    public SecondOrderNewton(String expression) {
        String[] stringCoefficients = expression.split("x\\^\\d+\\+?");
        this.coefficients = new int[stringCoefficients.length];
        for (int i = 0; i < stringCoefficients.length; i++) {
            this.coefficients[i] = Integer.parseInt(stringCoefficients[i]);
        }
    }

    public double calculate() {
        return 0;
    }
}
