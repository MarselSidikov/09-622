package ru.itis;

public class Main {

    public static void main(String[] args) {
        // те поля, которые не задали - буду иницилизированы по умолчанию
        // boolean - false
        // int - 0
        // double - 0.0
        // char - '\0'
        // String - null
	    User user = User.builder()
                .age(23)
                .sex('M')
                .name("Marsel")
                .build();

	    User azat = User.builder()
                .name("Azat")
                .build();
    }
}
