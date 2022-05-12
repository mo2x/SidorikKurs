package windows.parts;

import javax.swing.*;
import java.awt.*;

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
