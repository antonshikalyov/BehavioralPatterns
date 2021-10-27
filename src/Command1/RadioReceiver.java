package Command1;

public class RadioReceiver {
    public void run(Command command){
        command.execute();
    }
    public void turnOnMusic(){
        System.out.println("Turn on radio!");
    }
    public void turnOffMusic(){
        System.out.println("Turn off radio!");
    }
}
