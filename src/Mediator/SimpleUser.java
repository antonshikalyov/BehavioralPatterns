package Mediator;

public class SimpleUser implements User{
    Chat chat;

    public SimpleUser(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void setMessage(String message) {
        chat.getMassage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User get message: " + message);
    }
}
