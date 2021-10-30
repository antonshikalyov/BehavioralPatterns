package Observer;

import java.util.ArrayList;
import java.util.List;

public class Frilance implements Observed{
    List<String> job = new ArrayList<>();
    List<Observer> followers = new ArrayList<Observer>();

    public void addVacancy(String newJob){
        this.job.add(newJob);
        allNotify();
    }

    public void removeVacancy(String newJob){
        this.job.remove(newJob);
        allNotify();
    }

    @Override
    public void addObserver(Observer observer) {
        this.followers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.followers.remove(observer);
    }

    @Override
    public void allNotify() {
        for (Observer observer: followers) {
            observer.events(job);
        }
    }
}
