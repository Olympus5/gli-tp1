package fr.istic.gli.tp1.view;

import fr.istic.gli.tp1.controller.AbstractController;
import fr.istic.gli.tp1.model.AbstractModel;
import fr.istic.gli.tp1.observer.Observable;
import fr.istic.gli.tp1.observer.Observer;
import fr.istic.gli.tp1.util.Nuplet;

import javax.swing.JFrame;
import java.awt.*;
import java.util.Map;

public class Expense extends JFrame implements Observer {
    private DoughnutChart doughnutChart;
    private AbstractController controller;

    public Expense(AbstractController controller) {
        this.controller = controller;
        this.setTitle("Expense chart");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.doughnutChart = new DoughnutChart();
        this.setContentPane(doughnutChart);
        this.setBackground(Color.white);
        this.setVisible(true);
    }

    @Override
    public void update(Observable observable) {
        AbstractModel model = (AbstractModel) observable;
    }
}
