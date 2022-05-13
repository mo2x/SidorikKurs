package windows.parts;

import javax.swing.*;
import java.awt.*;

/**
 * Класс содержит в себе объекты унаследованные от {@link WorkPanelPart}
 * имеет в себе инструменты для работы с программой
 * @author Borodovsky A.A
 * @version 1.0
 */
public class ToolComponent extends JPanel {
    public InputComponent inputComponent = new InputComponent();
    public GraphicXYOpt graphicXYOpt = new GraphicXYOpt();
    public SimData simData = new SimData();

    public ToolComponent(){
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = GridBagConstraints.RELATIVE;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.anchor = GridBagConstraints.PAGE_START;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        add(inputComponent,gridBagConstraints);
        add(simData,gridBagConstraints);
        add(graphicXYOpt,gridBagConstraints);
        gridBagConstraints.weighty = 1;
        add(new JPanel(),gridBagConstraints);
    }
}
