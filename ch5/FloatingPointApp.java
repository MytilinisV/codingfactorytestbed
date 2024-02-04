package gr.aueb.cf.ch5;

/**
 * float / double demo
 */
public class FloatingPointApp {

    public static void main(String[] args) {
        float floatNum = 4.5F;
        double doubleNum = 20d;
        int num = 23;
        double result = 0.0;

        result = floatNum + num + doubleNum;

        System.out.printf("%.2f + %.2f + %d = %.2e", floatNum, doubleNum, num, result); // %f για float & double e = exponential (scientific calc) & %g

    }


}
