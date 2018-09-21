package fr.istic.gli.tp1.model;

import fr.istic.gli.tp1.observer.Observable;
import fr.istic.gli.tp1.observer.Observer;
import fr.istic.gli.tp1.util.Nuplet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Model implements Observable {
    protected String label;
    protected double value;
    protected Map<String, Nuplet<Double, String>> activities = new HashMap<>();

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) throws NullPointerException {
        if(observer != null) {
            this.observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer != null) {
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for(Observer observer : this.observers) {
            observer.update(this);
        }
    }

    public abstract String getLabel();

    public abstract void setLabel(String label);

    public abstract double getValue();

    public abstract void setValue(double value);

    public abstract Map<String, Nuplet<Double, String>> getActivities();

    public abstract void setActivities(Map<String, Nuplet<Double, String>> activities);

    public abstract void reset();
}
