package window.parts;

import Main.Program;
import window.MainWindow;

import java.awt.*;

public class SimData extends WorkPanelPart{
    double max = 0;
    double timeD = 0;
    Label timeV;
    Label heightV;
    public SimData(){
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        setBorderColor(Color.BLACK);
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;

        gridBagConstraints.weightx = 0;
        Label height = new Label("Высота подьема тела (м):");
        add(height,gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 0;
        heightV = new Label(String.valueOf(max));
        add(heightV,gridBagConstraints);


        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 0;
        Label time = new Label("Время полета (с):");
        add(time,gridBagConstraints);

        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 0;
        timeV = new Label(String.valueOf(timeD));
        add(timeV,gridBagConstraints);

    }

    public void setMax(double max) {
        this.max = max;
        heightV.setText(String.valueOf(max));
    }

    public void setTime(double time) {
        this.timeD = time;
        timeV.setText(String.valueOf(time));
    }
}
