package Mediator;

import java.util.ArrayList;
import java.util.List;

public class MyChat implements Chat{
    User user;
    List<User> users = new ArrayList<>();

    void AddUser(User newUser){
        users.add(newUser);
    }


    @Override
    public void getMassage(String message, User user) {
        for (User newUser: users) {
            newUser.getMessage(message);
        }
    }
}
