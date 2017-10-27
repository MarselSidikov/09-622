package ru.ivmiit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.ivmiit.models.User;

import java.util.List;

/**
 * 14.10.2017
 * UsersRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersRepository
        extends JpaRepository<User, Long> {
}
