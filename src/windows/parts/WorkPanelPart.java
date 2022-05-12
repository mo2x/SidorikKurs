package windows.parts;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public abstract class WorkPanelPart extends JComponent {
    TitledBorder title;
    String titleName;
    public void setBorderColor(Color color){
        title = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(color),
                titleName);
        setBorder(title);
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
        setBorderColor(title.getTitleColor());
    }

    public String getTitleName() {
        return titleName;
    }
}
