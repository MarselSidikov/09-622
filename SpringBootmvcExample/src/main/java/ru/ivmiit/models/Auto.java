package ru.ivmiit.models;

import lombok.*;

import javax.persistence.*;

/**
 * 27.10.2017
 * Auto
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private String model;
    private String color;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    // колонки в БД нет
    @Transient
    private Long ownerId;
}
