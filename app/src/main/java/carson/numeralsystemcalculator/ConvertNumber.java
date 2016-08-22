package vojuln.numeralsystemcalculator;

import android.util.Log;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by carson on 23/08/15.
 */
public class ConvertNumber {
    public static BigDecimal toDecimal(String a, int radix) {

        boolean negative = false;

        if (a.startsWith("-")) {
            a = a.replace("-", "");
            negative = true;
        }

        int decimalIndex = a.indexOf(".");

        a = a.replace(".", "");

        if (decimalIndex == -1) {
            decimalIndex = a.length();
        }

        BigDecimal decimal = BigDecimal.ZERO;
        MathContext powerContext = new MathContext(1000, RoundingMode.HALF_EVEN);

        BigDecimal bigDecimalRadix = new BigDecimal(radix);

        for (int i = 0; i < a.length(); i++) {

            switch (a.charAt(i)) {

                case '0':
                    decimal = decimal.add(BigDecimal.valueOf(0).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case '1':
                    decimal = decimal.add(BigDecimal.valueOf(1).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case '2':
                    decimal = decimal.add(BigDecimal.valueOf(2).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case '3':
                    decimal = decimal.add(BigDecimal.valueOf(3).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case '4':
                    decimal = decimal.add(BigDecimal.valueOf(4).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case '5':
                    decimal = decimal.add(BigDecimal.valueOf(5).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case '6':
                    decimal = decimal.add(BigDecimal.valueOf(6).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case '7':
                    decimal = decimal.add(BigDecimal.valueOf(7).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case '8':
                    decimal = decimal.add(BigDecimal.valueOf(8).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case '9':
                    decimal = decimal.add(BigDecimal.valueOf(9).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'A':
                    decimal = decimal.add(BigDecimal.valueOf(10).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'B':
                    decimal = decimal.add(BigDecimal.valueOf(11).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'C':
                    decimal = decimal.add(BigDecimal.valueOf(12).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'D':
                    decimal = decimal.add(BigDecimal.valueOf(13).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'E':
                    decimal = decimal.add(BigDecimal.valueOf(14).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'F':
                    decimal = decimal.add(BigDecimal.valueOf(15).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'G':
                    decimal = decimal.add(BigDecimal.valueOf(16).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'H':
                    decimal = decimal.add(BigDecimal.valueOf(17).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'I':
                    decimal = decimal.add(BigDecimal.valueOf(18).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'J':
                    decimal = decimal.add(BigDecimal.valueOf(19).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'K':
                    decimal = decimal.add(BigDecimal.valueOf(20).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'L':
                    decimal = decimal.add(BigDecimal.valueOf(21).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'M':
                    decimal = decimal.add(BigDecimal.valueOf(22).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'N':
                    decimal = decimal.add(BigDecimal.valueOf(23).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'O':
                    decimal = decimal.add(BigDecimal.valueOf(24).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'P':
                    decimal = decimal.add(BigDecimal.valueOf(25).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'Q':
                    decimal = decimal.add(BigDecimal.valueOf(26).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'R':
                    decimal = decimal.add(BigDecimal.valueOf(27).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'S':
                    decimal = decimal.add(BigDecimal.valueOf(28).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'T':
                    decimal = decimal.add(BigDecimal.valueOf(29).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'U':
                    decimal = decimal.add(BigDecimal.valueOf(30).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'V':
                    decimal = decimal.add(BigDecimal.valueOf(31).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'W':
                    decimal = decimal.add(BigDecimal.valueOf(32).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'X':
                    decimal = decimal.add(BigDecimal.valueOf(33).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'Y':
                    decimal = decimal.add(BigDecimal.valueOf(34).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'Z':
                    decimal = decimal.add(BigDecimal.valueOf(35).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'a':
                    decimal = decimal.add(BigDecimal.valueOf(36).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'b':
                    decimal = decimal.add(BigDecimal.valueOf(37).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'c':
                    decimal = decimal.add(BigDecimal.valueOf(38).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'd':
                    decimal = decimal.add(BigDecimal.valueOf(39).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'e':
                    decimal = decimal.add(BigDecimal.valueOf(40).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'f':
                    decimal = decimal.add(BigDecimal.valueOf(41).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'g':
                    decimal = decimal.add(BigDecimal.valueOf(42).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'h':
                    decimal = decimal.add(BigDecimal.valueOf(43).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'i':
                    decimal = decimal.add(BigDecimal.valueOf(44).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'j':
                    decimal = decimal.add(BigDecimal.valueOf(45).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'k':
                    decimal = decimal.add(BigDecimal.valueOf(46).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'l':
                    decimal = decimal.add(BigDecimal.valueOf(47).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'm':
                    decimal = decimal.add(BigDecimal.valueOf(48).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'n':
                    decimal = decimal.add(BigDecimal.valueOf(49).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'o':
                    decimal = decimal.add(BigDecimal.valueOf(50).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'p':
                    decimal = decimal.add(BigDecimal.valueOf(51).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'q':
                    decimal = decimal.add(BigDecimal.valueOf(52).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'r':
                    decimal = decimal.add(BigDecimal.valueOf(53).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 's':
                    decimal = decimal.add(BigDecimal.valueOf(54).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 't':
                    decimal = decimal.add(BigDecimal.valueOf(55).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'u':
                    decimal = decimal.add(BigDecimal.valueOf(56).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'v':
                    decimal = decimal.add(BigDecimal.valueOf(57).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'w':
                    decimal = decimal.add(BigDecimal.valueOf(58).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'x':
                    decimal = decimal.add(BigDecimal.valueOf(59).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'y':
                    decimal = decimal.add(BigDecimal.valueOf(60).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                case 'z':
                    decimal = decimal.add(BigDecimal.valueOf(61).multiply(bigDecimalRadix.pow(decimalIndex - 1 - i, powerContext)));
                    break;
                default:
                    System.out.println("invalid");
                    break;

            }

        }


        BigDecimal y;
        if (negative) {
            y = new BigDecimal("-" + decimal);
        } else {
            y = new BigDecimal(decimal + "");
        }

        Log.d("tag", y + "");

        return y;
    }


    public static String fromDecimal(String k, int radix, char[] digits) {
        BigDecimal h = new BigDecimal(k);

        boolean negative = false;

        String decimalString = String.valueOf(h);

        if (decimalString.startsWith("-")) {
            decimalString = decimalString.replace("-", "");
            negative = true;
        }

        int decimalIndex = decimalString.indexOf(".");

        BigInteger wholeNumber;
        BigDecimal fractionalNumber;

        String whole;
        String fraction;

        if (decimalIndex != -1) {
            wholeNumber = new BigInteger(decimalString.substring(0, decimalIndex));
            fractionalNumber = new BigDecimal(decimalString.substring(decimalIndex, decimalString.length()));

            whole = wholeNumber(wholeNumber, radix, digits);
            fraction = fractionalNumber(fractionalNumber, radix, digits);

            return removeExtraneousZeros(whole + "." + fraction, negative);

        } else {
            wholeNumber = new BigInteger(decimalString);

            whole = wholeNumber(wholeNumber, radix, digits);

            return removeExtraneousZeros(whole, negative);

        }


    }

    public static String wholeNumber(BigInteger wholeNumber, int radix, char[] digits) {

        String returnString = "";

        while (true) {
            returnString = returnString + digits[Integer.parseInt(String.valueOf(wholeNumber.mod(BigInteger.valueOf(radix))))];

            wholeNumber = wholeNumber.subtract(wholeNumber.mod(BigInteger.valueOf(radix)));
            wholeNumber = wholeNumber.divide(BigInteger.valueOf(radix));

            if (wholeNumber.equals(BigInteger.ZERO)) {
                break;
            }
        }

        returnString = new StringBuilder(returnString).reverse().toString();

        return returnString;
    }

    public static String removeExtraneousZeros(String convertedValue, boolean negative) {

        if (!convertedValue.equals("0")) {

            while (true) {
                if (!convertedValue.startsWith("0")) {
                    break;
                }
                convertedValue = convertedValue.substring(1, convertedValue.length());
            }

            if (convertedValue.contains(".")) {
                while (true) {
                    if (!convertedValue.endsWith("0")) {
                        break;
                    }
                    convertedValue = convertedValue.substring(0, convertedValue.length() - 1);
                }
            }
        }

        if (negative) convertedValue = "-" + convertedValue;

        return convertedValue;
    }

    public static String fractionalNumber(BigDecimal fractionalNumber, int radix, char[] digits) {

        String fraction = "";

        for (int i = 0; i < 100; i++) {
            System.out.println(fractionalNumber);

            fractionalNumber = fractionalNumber.multiply(BigDecimal.valueOf(radix));

            int decimalIndex = String.valueOf(fractionalNumber).indexOf(".");

            if (decimalIndex == -1) break;

            fraction = fraction + digits[Integer.parseInt(String.valueOf(fractionalNumber).substring(0, decimalIndex))];
            fractionalNumber = new BigDecimal(String.valueOf(fractionalNumber).substring(decimalIndex, String.valueOf(fractionalNumber).length()));
        }
        System.out.println(fractionalNumber);
        return fraction;

    }
}
