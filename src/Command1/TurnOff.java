package Command1;

public class TurnOff implements Command{
    RadioReceiver radioReceiver;

    public TurnOff(RadioReceiver radioReceiver) {
        this.radioReceiver = radioReceiver;
    }

    @Override
    public void execute() {
        radioReceiver.turnOffMusic();
    }
}
