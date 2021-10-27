package Mediator;

public class Admin implements User{
    Chat chat;

    public Admin(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void setMessage(String message) {
        chat.getMassage(message, this);

    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin get message: " + message);
    }
}
