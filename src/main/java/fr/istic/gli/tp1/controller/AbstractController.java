package fr.istic.gli.tp1.controller;

import fr.istic.gli.tp1.model.AbstractModel;
import fr.istic.gli.tp1.util.Nuplet;

public abstract class AbstractController implements Controller {
    protected AbstractModel model;
    protected String label, activityName, activityDescription;
    protected double money, activityCost;


    public AbstractController(AbstractModel model) {
        this.model = model;
    }

    public void reset() {
        this.model.reset();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
        this.control();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
        this.control();
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String lastActivityName, String activityName) {
        this.activityName = activityName;
        this.control();
    }

    public void setActivity(String name, double cost, String description) {
        this.activityName = name;
        this.activityCost = cost;
        this.activityDescription = description;
        this.control();
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityName, String activityDescription) {
        this.activityDescription = activityDescription;
        this.control();
    }

    public double getActivityCost() {
        return activityCost;
    }

    public void setActivityCost(String activityName, double activityCost) {
        this.activityCost = activityCost;
        control();
    }
}
