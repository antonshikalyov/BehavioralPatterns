package Command1;

public class SwitchButton {
    Command turnOnCommand;
    Command turnOffCommand;

    public SwitchButton(Command turnOnCommand, Command turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }
}
