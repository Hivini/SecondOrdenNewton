public class Main {
    public static void main(String[] args) {
        SecondOrderNewton son = new SecondOrderNewton("1x^10+0x^9+0x^8+0x^7+0x^6+0x^5+0x^4+0x^3+0x^2-10x^1+4");
        System.out.println(son.calculate());
    }
}
