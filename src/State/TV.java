package State;

public class TV {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void switchChannel(){
        if (action instanceof QTW){
            setAction(new Discovery());
        }
        else if (action instanceof Discovery){
            setAction(new NEWS());
        }
        else if (action instanceof NEWS){
            setAction(new QTW());
        }
    }

    public void show(){
        action.show();
    }
}
