package Mediator;

public class Main {
    public static void main(String[] args) {
        MyChat chat = new MyChat();
        User s1 = new SimpleUser(chat);
        User s2 = new SimpleUser(chat);
        User admin = new Admin(chat);

        chat.AddUser(s1);
        chat.AddUser(s2);
        chat.AddUser(admin);

        s1.setMessage("Hi there!");
    }
}
