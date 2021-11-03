package Strategy;

public class Main {
    public static void main(String[] args) {
        Security security = new Security();

        security.setAction(new LookToTheObject());
        security.changeActivity();

        security.setAction(new WatchTV());
        security.changeActivity();

        security.setAction(new Sleeping());
        security.changeActivity();
    }
}
