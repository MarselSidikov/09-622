package ru.ivmiit;

import ru.ivmiit.algo.LongArithmetic;

public class Main {

    public static void main(String[] args) {
        // в переменную result кладу результат сложения чисел
        char result[] = LongArithmetic.sum("7084538127151464".toCharArray(), "1084538127151464".toCharArray());
        String asString = new String(result);
        System.out.println(asString);
    }
}
