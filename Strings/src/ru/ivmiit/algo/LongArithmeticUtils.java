package ru.ivmiit.algo;

/**
 * 20.02.2017
 * LongArithmeticUtils
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class LongArithmeticUtils {
    public static void reverse(char[] value) {
        for (int i = 0; i < value.length / 2; i++) {
            char temp = value[i];
            value[i] = value[value.length - 1 - i];
            value[value.length - 1 - i] = temp;
        }
    }

    public static int fromCharDigit(char c) {
        return c - '0';
    }

    public static char toCharDigit(int i) {
        return (char)(i + '0');
    }

    public static char[] prepareToReturn(char oldReturnValue[]) {
        if (oldReturnValue[0] == 0) {
            char newReturnValue[] = new char[oldReturnValue.length-1];
            for (int i = 1; i < oldReturnValue.length; i++) {
                newReturnValue[i - 1] = oldReturnValue[i];
            }
            return newReturnValue;
        } else return oldReturnValue;
    }
}
