package CalculatorNew;
import java.io.IOException;
import java.util.Scanner;

public class CalculatorNew {
    static RomanNumeral Numeral = new RomanNumeral();
    private static final int FROM = 1;
    private static final int TO = 10;

    public static void main(String[] args) throws NumberFormatException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Вводить числа можно только от 1 до 10: ");

            while (true) {

                String line = sc.next();

                if (isNumber(line)) {

                    int d = 0;
                    int a = Integer.valueOf(line);
                    String c = sc.next("\\+|\\-|\\*|\\/");
                    int b = Integer.valueOf(sc.next());

                    if (isInRange(a, b, FROM, TO)) {
                        if ("+".equals(c)) {
                            d = a + b;
                        } else if ("-".equals(c)) {
                            d = a - b;
                        } else if ("*".equals(c)) {
                            d = a * b;
                        } else if ("/".equals(c)) {
                            d = a / b;
                        }
                        System.out.println(d);
                        break;
                    } else {
                        throw new NumberFormatException("Invalid format");
                    }

                } else {
                    int e = Numeral.convertRomanToInt(line);
                    int q;
                    int s = 0;
                    String t;
                    t = sc.next("\\+|\\-|\\*|\\/");
                    q = Numeral.convertRomanToInt(sc.next());
                    if ("+".equals(t)) {
                        s = e + q;
                    } else if ("-".equals(t)) {
                        s = e - q;
                    } else if ("*".equals(t)) {
                        s = e * q;
                    } else if ("/".equals(t)) {
                        s = e / q;
                    }
                    System.out.println(Numeral.convertIntegerToRoman(s));
                    break;
                }
            }
    }



    private static boolean isInRange(int value1, int value2 , int from, int to) {
        return value1 >= from && value1 <= to && value2 >= from && value2 <= to;
    }

    private static boolean isNumber(String str) {
        return str.matches("-?\\d+");
    }
}
