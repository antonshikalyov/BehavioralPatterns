package ChainOfResponsibility;

public class MediumNotifare implements Notifaer{
    private int notifarePriority;
    Notifaer nextNotifaer;

    public MediumNotifare(int notifarePriority) {
        this.notifarePriority = notifarePriority;
    }

    public void setNextNotifaer(Notifaer nextNotifaer) {
        this.nextNotifaer = nextNotifaer;
    }

    @Override
    public void notifaer(String message, int level) {
        if (level <= notifarePriority){
            System.out.println("Оранжевый уровень: " + message + "Level: " + level);
        }else if (nextNotifaer != null){
            nextNotifaer.notifaer(message, level);
        }
    }
}
