package ru.ivmiit.messages;

import ru.ivmiit.models.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 10.11.2017
 * MessagesService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
/*
Класс Singleton, то есть программисты не могут создавать объекты класса.
Объект данного класса создается сам при записуке приложения
и только один раз
 */
public class MessagesService {
    // статическая переменная, содержит ссылку на единственный
    // объект
    // класса MessagesService
    private static MessagesService instance;

    // карта, где каждому пользователю соответствует
    // список его непрочитанных сообщений
    private Map<String, List<Message>> messages;

    // приватный консруктор - приватный, потому что
    // мы не хотим чтобы программисты создавали объекты
    // MessagesService m = new MessagesService(); - нельзя, потому что
    // конструктор приватный
    private MessagesService() {
        // создаем словарь
        // Concurrent - для того, чтобы работать
        // с помощью многопоточностью
        messages = new ConcurrentHashMap<>();
    }

    // статический конструктор, вызывается при запуске приложения
    static {
        // создаем единственный экземпляр
        instance = new MessagesService();
    }

    // статический метод для получения единственного экземпляра
    public static MessagesService getInstance() {
        return instance;
    }

    // добавить сообщение
    public void addMessage(Message message) {
        // keySet - множество ключей, а в нашем словаре ключ - это имя
        // бежим по всем пользователям
        for (String user : messages.keySet()) {
            // в список каждого пользователя кладем это сообщение
            messages.get(user).add(message);
        }
    }

    // получить сообщения определенного пользователя
    public List<Message> getMessages(String name) {
        // запускаем бесконечный цикл
        // чтобы клиент ждал
        while (true) {
            // если для данного пользователя остались сообщения
            if (messages.get(name).size() != 0) {
                // выбираем их из списка
                List<Message> result = messages.get(name);
                // очищаем список его сообщений
                messages.put(name, new ArrayList<>());
                // возвращаем сообщения пользователю
                return result;
            }
        }
    }

    // регистрируем пользователя
    // создаем ему ящик
    public void registration(String name) {
        messages.put(name, new ArrayList<>());
    }
}
