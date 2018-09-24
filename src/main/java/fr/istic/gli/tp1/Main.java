package fr.istic.gli.tp1;

import fr.istic.gli.tp1.controller.AbstractController;
import fr.istic.gli.tp1.controller.ExpenseController;
import fr.istic.gli.tp1.model.AbstractModel;
import fr.istic.gli.tp1.model.ExpenseModel;
import fr.istic.gli.tp1.view.Expense;

public class Main {
    public static void main(String[] args) {
        AbstractModel model = new ExpenseModel();
        AbstractController controller = new ExpenseController(model);
        Expense view = new Expense(controller);
        model.addObserver(view);
    }
}
