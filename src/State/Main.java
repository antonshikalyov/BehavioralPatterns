package State;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.setAction(new QTW());
        tv.show();
        tv.switchChannel();
        tv.show();
        tv.switchChannel();
        tv.show();
        tv.switchChannel();
        tv.show();
    }
}
