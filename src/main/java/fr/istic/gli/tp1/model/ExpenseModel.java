package fr.istic.gli.tp1.model;

import fr.istic.gli.tp1.util.Nuplet;

import java.util.HashMap;
import java.util.Map;

public class ExpenseModel extends AbstractModel {
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
    public double getMoney() {
        return this.money;
    }

    @Override
    public void setMoney(double money) {
        this.money = money;
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
    public Nuplet<Double, String> getActivity(String name) {
        return this.activities.get(name);
    }

    @Override
    public void setActivity(String name, Double cost, String description) {
        this.activities.put(name, new Nuplet<>(cost, description));
    }

    @Override
    public void reset() {
        this.label = "";
        this.money = 0.0;
        this.activities = new HashMap<>();
    }
}
