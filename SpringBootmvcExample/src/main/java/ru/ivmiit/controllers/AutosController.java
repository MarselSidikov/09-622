package ru.ivmiit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.ivmiit.models.Auto;
import ru.ivmiit.models.User;
import ru.ivmiit.repositories.AutoRepository;
import ru.ivmiit.repositories.UsersRepository;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 27.10.2017
 * AutosController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class AutosController {

    @Autowired
    private AutoRepository autoRepository;

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping(value = "/autos")
    public String getAutosPage(@ModelAttribute("model")
                                       ModelMap model) {
        List<Auto> autos = autoRepository.findAll();
        model.addAttribute("autos", autos);
        return "autos_page";
    }

    @PostMapping(value = "/autos")
    public String addUser(@ModelAttribute Auto auto) {
        User owner = usersRepository.findOne(auto.getOwnerId());
        auto.setOwner(owner);
        autoRepository.save(auto);
        return "redirect:/autos";
    }

    @GetMapping("/autos/by_owner")
    public String getAutosByOwner(@RequestParam("owner") Long ownerId, @ModelAttribute("model") ModelMap model) {
        User owner = usersRepository.findOne(ownerId);
        List<Auto> autos = owner.getAutos();
        model.addAttribute("autos", autos);
        return "autos_page";
    }

    @GetMapping("/autos/by_color")
    public String getAutosByOwner(@RequestParam("color") String color, @ModelAttribute("model") ModelMap model) {
        List<Auto> autos = autoRepository.findAllByColor(color);
        model.addAttribute("autos", autos);
        return "autos_page";
    }

    @GetMapping("/autos/{auto-id}")
    public String getAuto(@PathVariable("auto-id") Long autoId) {
        return null;
    }
}
