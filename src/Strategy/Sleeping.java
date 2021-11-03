package Strategy;

public class Sleeping implements Action{
    @Override
    public void execute() {
        System.out.println("Sleeping on the post!");
    }
}
