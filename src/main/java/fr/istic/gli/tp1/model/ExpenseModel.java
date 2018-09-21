package fr.istic.gli.tp1.model;

import fr.istic.gli.tp1.util.Nuplet;

import java.util.HashMap;
import java.util.Map;

public class ExpenseModel extends Model {
    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
        this.notifyAllObserver();
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
        this.notifyAllObserver();
    }

    @Override
    public Map<String, Nuplet<Double, String>> getActivities() {
        return this.activities;
    }

    @Override
    public void setActivities(Map<String, Nuplet<Double, String>> activities) {
        this.activities = activities;
        this.notifyAllObserver();
    }

    @Override
    public void reset() {
        this.label = "";
        this.value = 0.0;
        this.activities = new HashMap<>();
    }
}
