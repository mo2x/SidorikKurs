package windows.parts;

import Main.Program;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

import static Main.Program.dataManager;

/**
 * класс обращается к {@link DataManager.DataManager} и отрисоывает график на осное полученных данных
 * @author Borodovsky A.A
 * @version 1.0
 */
public class Graphic extends JPanel {

    public JFreeChart chart = ChartFactory.createXYLineChart(
            "",
            "",
            "",
            new XYSeriesCollection(),
            PlotOrientation.HORIZONTAL,
            true, false,false
    );

    public void setChart(JFreeChart chart){
        this.chart = chart;
        chart.getRenderingHints().put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        repaint();
    }

    public void resetChart(){
        String nameX = (String) Program.mainWindow.toolComponent.graphicXYOpt.nameX.getSelectedItem();
        String nameY = (String) Program.mainWindow.toolComponent.graphicXYOpt.nameY.getSelectedItem();
        XYDataset dataset= dataManager.createDataset(nameX,nameY);
        Program.mainWindow.toolComponent.simData.setMax(dataManager.getMaxY());
        Program.mainWindow.toolComponent.simData.setTime(dataManager.getTime());
        JFreeChart chart = ChartFactory.createXYLineChart(
                "",
                "",
                "",
                dataset,
                PlotOrientation.VERTICAL,
                false,false,false
        );
        Program.mainWindow.simulationWin.setChart(chart);
        setChart(chart);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = ( Graphics2D ) g;
        chart.draw(g2d, g2d.getClipBounds());
    }
}
