package ExE_ObserverPattern;

public interface Subject {
    public void register (Observer o);
    public void remove(Observer o);
    public void notifyObserver();
}
