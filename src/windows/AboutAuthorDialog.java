package windows;

import javax.swing.*;
import java.awt.*;

public class AboutAuthorDialog extends JDialog {
    public AboutAuthorDialog(){
        setLayout(new BorderLayout());
        setTitle("Об авторе");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300,200);
        setResizable(false);
        JLabel[] textLabels = new JLabel[]{
                new JLabel("Автор"),
                new JLabel("Студент группы 10702319"),
                new JLabel("Бородовский А.А"),
                new JLabel("andrborodov@gmail.com")
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
