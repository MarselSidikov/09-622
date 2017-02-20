package ru.ivmiit.algo;

import static ru.ivmiit.algo.LongArithmeticUtils.*;
/**
 * 20.02.2017
 * LongArithmetic
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class LongArithmetic {
    public static char[] sum(char[] a,char[] b) {
        // переворачиваем два числа
        reverse(a);
        reverse(b);

        // вычисляем длину макисмального
        int maxLength = Math.max(a.length, b.length);

        // если первое число не максимальное по длине
        // меняем их местами
        if (a.length != maxLength) {
            char temp[] = a;
            a = b;
            b = temp;
        }

        // здесь храним результат, он всегда может быть на 1-ну цифру больше
        char result[] = new char[maxLength + 1];

        // здесь храним разряд для переноса
        int forTransfer = 0;

        // бежим по максмальному числу
        for (int i = 0; i < maxLength; i++) {
            // забираем числовое представление символа
            int aValue = fromCharDigit(a[i]);


            int bValue;
            // если второе число кончилось
            if (i > b.length - 1) {
                // ставим нолик
                bValue = 0;
            } else {
                // в противном случае забираем числовое представление символа
                bValue = fromCharDigit(b[i]);
            }

            // резлультат сложения двух чисел на одинаковых разрядах
            int sumValues = aValue + bValue + forTransfer;

            // если резльутат превысел 10
            if (sumValues >= 10) {
                forTransfer = 1;
                sumValues = sumValues - 10;
            } else {
                forTransfer = 0;
            }

            result[i] = toCharDigit(sumValues);
        }

        // в конце программы если остался остаток
        if (forTransfer > 0) {
            result[result.length - 1] = toCharDigit(forTransfer);
        }

        reverse(result);
        return prepareToReturn(result);
    }

    public static char[] sub(char[] aValue, char bValue) {
        return null;
    }

    public static char[] multiply(char[] aValue, char bValue) {
        return null;
    }

    public static char[] div(char[] aValue, char bValue) {
        return null;
    }


}
