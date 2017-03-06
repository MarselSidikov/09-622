package ru.ivmiit;

/**
 * 06.03.2017
 * StringClass
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class StringClass {
    public static void main(String[] args) {

        // работает StringPool - литеральные строки представляются в виде одного объекта пула
        String a = "Hello";
        String b = "Hello";

        System.out.println(a == b);

        String aObject = new String("Hello");
        String bObject = new String("Hello");

        System.out.println(aObject == bObject);

        System.out.println(aObject.equals(bObject));
        System.out.println(aObject.intern() == bObject.intern());

        System.out.println(aObject == a);
        System.out.println(aObject.intern() == a);

        String aString = "Bye";
        String bString = "Bye";

        aString = aString.replace('B', 'X');

        System.out.println(aString);
        System.out.println(bString);
    }
}
