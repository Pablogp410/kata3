package software.ulpgc.kata3;

import com.sun.tools.javac.Main;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException{
        this.setTitle("Histogram Viewer");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(createHistogramDisplay());
    }

    private Component createHistogramDisplay() {
        JFreeChart histogram = ChartFactory.createHistogram(
                "Histogram",
                "ages",
                "count",
                dataset(),
                PlotOrientation.VERTICAL,
                false, false, false);
        return new ChartPanel(histogram);
    }

    private HistogramDataset dataset() {
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("serie", values(), 5);
        return dataset;
    }

    private double[] values() {
        return new double[] {1,4,5,2,5,7,8,5,2,9,7,8,4,2,6,7,4};
    }

    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
}
