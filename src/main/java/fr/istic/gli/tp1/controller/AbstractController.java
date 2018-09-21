package fr.istic.gli.tp1.controller;

import fr.istic.gli.tp1.model.AbstractModel;

public abstract class AbstractController implements Controller {
    protected AbstractModel model;
    protected String label, activityName, activityDescription;
    protected Double money, activityCost;


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
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getActivityCost() {
        return activityCost;
    }

    public void setActivityCost(Double activityCost) {
        this.activityCost = activityCost;
    }
}
