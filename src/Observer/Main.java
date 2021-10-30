package Observer;

public class Main{
    public static void main(String[] args) {
        Frilance frilance = new Frilance();
        frilance.addVacancy("Create html landing");
        frilance.addVacancy("We have heeds in Java junior");

        Observer follower1 = new Folover("Dima");
        Observer follower2 = new Folover("Oleg");
        frilance.addObserver(follower1);
        frilance.addObserver(follower2);

        frilance.addVacancy("We searching C++ developer");
        frilance.removeVacancy("We have heeds in Java junior");
    }
}
