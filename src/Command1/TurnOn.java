package Command1;

public class TurnOn implements Command{
    RadioReceiver radioReceiver;

    public TurnOn(RadioReceiver radioReceiver) {
        this.radioReceiver = radioReceiver;
    }

    @Override
    public void execute() {
        radioReceiver.turnOnMusic();
    }
}
