package windows.parts;

import javax.swing.*;
import java.awt.*;
/**
 * часть {@link ToolComponent} которая настраивает оси графика
 * @author Borodovsky A.A
 * @version 1.0
 */
public class GraphicXYOpt extends WorkPanelPart {
    String[] data  = new String[] {"X","Y","Линейная скорость","Скорость по X","Скорость по Y","Время"};
    public final JComboBox<String> nameX = new JComboBox<>(data);
    public final JComboBox<String> nameY = new JComboBox<>(data);

    public GraphicXYOpt(){
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        setBorderColor(Color.BLACK);
        setTitleName("Настройки Графика");
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;

        gridBagConstraints.weightx = 0;
        Label X = new Label("Ось Абсцисс");
        add(X,gridBagConstraints);

        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0;
        Label Y = new Label("Ось Ординат");
        add(Y,gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1;
        add(nameX,gridBagConstraints);

        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1;
        add(nameY,gridBagConstraints);
    }
}
