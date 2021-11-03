package Strategy;

public class Security {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void changeActivity(){
        action.execute();
    }
}
