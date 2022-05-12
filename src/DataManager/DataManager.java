package DataManager;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataManager implements Serializable {
    public boolean isSaved = false;
    public Map<String, ArrayList<Double>> dataMap = new HashMap<>();
    private double maxY;
    ArrayList<Double> x = new ArrayList<>();
    ArrayList<Double> y = new ArrayList<>();
    ArrayList<Double> velocityLine = new ArrayList<>();
    ArrayList<Double> velocityX = new ArrayList<>();
    ArrayList<Double> velocityY = new ArrayList<>();
    ArrayList<Double> time = new ArrayList<>();

    public DataManager(){
        dataMap.put("X", x);
        dataMap.put("Y", y);
        dataMap.put("Линейная скорость", velocityLine);
        dataMap.put("Скорость по X", velocityX);
        dataMap.put("Скорость по Y", velocityY );
        dataMap.put("Время", time);
    }

    public void addFrame(
            double x,
            double y,
            double velocityLine,
            double velocityX,
            double velocityY,
            double time){
        this.x.add(x);
        this.y.add(y);
        this.velocityLine.add(velocityLine);
        this.velocityX.add(velocityX);
        this.velocityY.add(velocityY);
        this.time.add(time);
    }

    public XYDataset createDataset(String nameX, String nameY){
        XYSeries newDataset = new XYSeries("",false);
        ArrayList<Double> datasetX = dataMap.get(nameX);
        ArrayList<Double> datasetY = dataMap.get(nameY);
        for (int i = 0; i < datasetX.size(); i++){
            newDataset.add(datasetX.get(i),datasetY.get(i));
        }
        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(newDataset);
        return dataset;
    }
    public void clear(){
        x.clear();
        y.clear();
        velocityLine.clear();
        velocityX.clear();
        velocityY.clear();
        time.clear();
        isSaved = false;
    }

    public void setMaxY(double maxY) {
        this.maxY = maxY;
    }

    public double getMaxY() {
        return maxY;
    }

    public double getTime(){
        return time.get(time.size()-1);
    }

    public void dataSave(){
        isSaved = true;
    }
}
