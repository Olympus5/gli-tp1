package fr.istic.gli.tp1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.List;

public class DoughnutChart extends JPanel {
    private List<Arc2D> items;
    private Arc2D label;
    private static final double GAP = 1.0;

    public DoughnutChart() {
        this.items = new ArrayList<>();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
        Arc2D.Float background = new Arc2D.Float(Arc2D.PIE);
        Arc2D.Float label = new Arc2D.Float(Arc2D.PIE);
        arc.setFrame((this.getWidth() - this.getHeight()) / 2, 0, this.getHeight(), this.getHeight());
        background.setFrame((this.getWidth() - this.getHeight() / 1.4) / 2, (this.getHeight() - this.getHeight() / 1.4) / 2, this.getHeight() / 1.4, this.getHeight() / 1.4);
        label.setFrame((this.getWidth() - this.getHeight() / 1.8) / 2, (this.getHeight() - this.getHeight() / 1.8) / 2, this.getHeight() / 1.8, this.getHeight() / 1.8);
        arc.setAngleStart(0.0);
        background.setAngleStart(0.0);
        label.setAngleStart(0.0);
        arc.setAngleExtent(360.0);
        background.setAngleExtent(360.0);
        label.setAngleExtent(360.0);

        g2.setColor(Color.GRAY);
        g2.fill(arc);

        g2.setColor(Color.WHITE);
        g2.fill(background);

        g2.setColor(Color.BLUE);
        g2.fill(label);
    }

    private Color selectColor(int i) {
        Color c;

        switch(i % 3) {
            case 0:
                c = Color.blue;
            break;

            case 1:
                c = Color.red;
            break;


            default:
                c = Color.green;
            break;
        }

        return c;
    }
}
