package windows;

import javax.swing.*;
import java.awt.*;

public class AboutProgramDialog extends JDialog {
    public AboutProgramDialog(){
        setLayout(new BorderLayout());
        setTitle("О Программе");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(700,150);
        setResizable(false);
        JLabel[] textLabels = new JLabel[]{
                new JLabel("Программа для"),
                new JLabel("рассчета движения в однородном гравитационном поле:"),
                new JLabel("В данной программе вы можете ввести данные броска физического"),
                new JLabel("объекта и арссчитать его траекторию движения до падения"),
                new JLabel("Результаты вычислений вы можете сохранять и загружать")
        };

        JPanel textPanel = new JPanel();
        textPanel.setBackground(Color.WHITE);
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        setLayout(new BorderLayout());
        Font font = new Font(Font.DIALOG, Font.BOLD, 16);
        for (JLabel label : textLabels) {
            label.setFont(font);
            label.setAlignmentX(Component.CENTER_ALIGNMENT);
            textPanel.add(label);
        }

        add(textPanel,BorderLayout.CENTER);
    }
}
