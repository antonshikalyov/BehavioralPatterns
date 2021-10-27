package ChainOfResponsibility;

public class MainCOR {
    public static void main(String[] args) {
        Level level = new Level();

        EasyNotifaer easyNotifaer = new EasyNotifaer(level.easy);
        MediumNotifare mediumNotifare = new MediumNotifare(level.medium);
        HardNotifaer hardNotifaer = new HardNotifaer(level.hard);

        easyNotifaer.setNextNotifaer(mediumNotifare);

        easyNotifaer.notifaer("Заболеваемость 20% вводим маски! ", level.easy);
        easyNotifaer.notifaer("Заболеваемость 40% вводим карантин на бары! ", level.medium);
        easyNotifaer.notifaer("Заболеваемость 60% вводим карантин на все! ", level.hard);
    }
}
