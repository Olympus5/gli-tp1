package fr.istic.gli.tp1.observer;

public interface Observable<T> {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAll();
    public T getState();
}
