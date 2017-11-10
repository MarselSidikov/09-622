package ru.ivmiit.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * 14.10.2017
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class User {
    // GenerationType - стратегия генерации первичного ключа
    /*
     TABLE - счетчик значеий провайдер будет хранить в отдельной таблице, такой подход не зависит от БД
    SEQUENCE - использует встроенный механизм генерации первичного ключа из бд (работает на Sequence)
    IDENTITY - использует специальный тип столбца (AUTO_INCREMENT - MySQL, SERIAL - PostgreSQL)
    AUTO - провайдер (то, что отвечает за работу с бд в джава) выбирает сам подход к генерации
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "owner")
    private List<Auto> autos;
}
