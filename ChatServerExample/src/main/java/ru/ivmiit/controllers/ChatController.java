package ru.ivmiit.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.ivmiit.messages.MessagesService;
import ru.ivmiit.models.Message;

import java.util.List;

/**
 * 10.11.2017
 * ChatController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class ChatController {
    @PostMapping(value = "/messages")
    @ResponseBody
    public void postMessage(@RequestBody Message message) {
        MessagesService.getInstance().addMessage(message);
    }

    @GetMapping(value = "/messages")
    // @ResponseBody говорит о том, что возвращаемое значение
    // функции будет телом ответа - в JSON
    @ResponseBody
    public List<Message> getMessages(@RequestParam("user") String user) {
        return MessagesService.getInstance().getMessages(user);
    }

    @GetMapping(value = "/register")
    @ResponseBody
    public void register(@RequestParam("user") String user) {
        MessagesService.getInstance().registration(user);
    }
}
