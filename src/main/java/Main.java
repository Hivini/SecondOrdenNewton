import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // SecondOrderNewton son = new SecondOrderNewton("1x^10+0x^9+0x^8+0x^7+0x^6+0x^5+0x^4+0x^3+0x^2-10x^1+4");
        while (true) {
            System.out.println("Enter the expression with the format ax^n+...+bx^2+cx^1+d");
            System.out.print("Expression: ");
            String exp = scanner.next();
            SecondOrderNewton son = new SecondOrderNewton(exp);
            System.out.format("Result: %.3f\n", son.calculate());
            System.out.print("Stop (y/n)?: ");
            String ans = scanner.next();
            if (ans.toLowerCase().equals("y")) {
                break;
            }
        }
    }
}
