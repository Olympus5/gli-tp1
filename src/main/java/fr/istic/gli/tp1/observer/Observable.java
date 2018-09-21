package fr.istic.gli.tp1.observer;

public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObserver();
}
