package ru.ivmiit;

import ru.ivmiit.models.User;

/**
 * 05.10.2017
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Marsel")
                .age(23)
                .build();
        System.out.println(user);
    }
}
