package ru.ivmiit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ivmiit.models.Auto;
import ru.ivmiit.models.User;

import java.util.List;

/**
 * 27.10.2017
 * AutoRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface AutoRepository
        extends JpaRepository<Auto, Long> {
    List<Auto> findAllByColor(String color);
    void deleteAllByOwner(User owner);
}