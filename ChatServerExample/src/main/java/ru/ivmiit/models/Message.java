package ru.ivmiit.models;

import lombok.Data;

/**
 * 10.11.2017
 * Message
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
// @Data - делает конструктор с параметрами, пустой конструктор
// геттеры и сеттеры - lombok
@Data
public class Message {
    private String text;
    private String user;
}
