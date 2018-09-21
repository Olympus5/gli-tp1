package fr.istic.gli.tp1.controller;

import fr.istic.gli.tp1.model.AbstractModel;

public class ExpenseController extends AbstractController {
    public ExpenseController(AbstractModel model) {
        super(model);
    }

    @Override
    public void control() {
        if(this.activityCost > 0 && this.activityName.length() > 0) {
            this.model.setActivity(this.activityName, this.activityCost, this.activityDescription);
        }

        if(this.label.length() > 0) {
            this.model.setLabel(this.label);
        }

        if(this.money > 0) {
            this.model.setMoney(money);
        }

        this.money = this.activityCost = 0.0;
        this.label = this.activityName = this.activityDescription = "";

    }
}
