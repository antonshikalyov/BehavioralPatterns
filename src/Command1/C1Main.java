package Command1;

public class C1Main {
    public static void main(String[] args) {
        RadioReceiver radio = new RadioReceiver();

        radio.run(new TurnOff(radio));
    }
}
