package Observer;

import java.util.List;

public class Folover implements Observer{
    String name;

    public Folover(String name) {
        this.name = name;
    }

    @Override
    public void events(List<String> job) {
        System.out.println("Hi " + name + " we have new job for you: " + job);
    }
}
