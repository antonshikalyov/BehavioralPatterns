package ChainOfResponsibility;

public class EasyNotifaer implements Notifaer{
    private int notifarePriority;
    Notifaer nextNotifaer;

    public EasyNotifaer(int notifarePriority) {
        this.notifarePriority = notifarePriority;
    }

    public void setNextNotifaer(Notifaer nextNotifaer) {
        this.nextNotifaer = nextNotifaer;
    }

    @Override
    public void notifaer(String message, int level) {
        if (level <= notifarePriority){
            System.out.println("Зеленый уровень: " + message + "Level: " + level);
        }else if (nextNotifaer != null){
           nextNotifaer.notifaer(message, level);
        }
    }
}
