package ru.ivmiit;

public class Main {
    // ФУНКЦИИ И ПРОЦЕДУРЫ
    // ФУНКЦИЯ - это подпрограмма,
    // которая возвращает результат
    // своего выполнение в место, где
    // она была вызвана

    // ОБЪЯВЛЕНИЕ ФУНКЦИИ
    // ТИП_ВОЗВР_ЗНАЧ имя_фукнции(список_формальных_параметров)

    public static boolean isPrime(int number) {
        if (number == 1 || number == 2 || number == 3) {
            return true;
        }

        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // ПРОЦЕДУРА - подпрограмма, не
    // возвращающая результат своего выполнения
    // но имеющая побочный эффект
    //
    // ОБЪЯВЛЕНИЕ ПРОЦЕДУРЫ
    // void имя_процедуры(список_формальных_параметров)
    public static void showNumbers(int a, int b) {
        for (int i = a; i < b; i++) {
            System.out.println(i);
        }
    }

    // передача аргументов в java идет по значению
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swapInArray(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        // вызов функции - в скобках - аргументы
	    boolean primeResult = isPrime(7);

        System.out.println(primeResult);

        showNumbers(2, 15);

        int x = 6;
        int y = 7;

        swap(x, y);
        System.out.println(x + " " + y);

        int myArray[] = {2, 4, 5, 6, 8};
        swapInArray(myArray, 2, 4);

        System.out.println(myArray[2] + " " + myArray[4]);
    }
}
