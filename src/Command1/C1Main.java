package Command1;

public class C1Main {
    public static void main(String[] args) {
        RadioReceiver radio = new RadioReceiver();
        Command turnOn = new TurnOn(radio);
        Command turnOff = new TurnOff(radio);

        SwitchButton switchButton = new SwitchButton(turnOn, turnOff);

        switchButton.turnOffCommand.execute();
    }
}
