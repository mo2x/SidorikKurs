package windows.parts;

import windows.SplashFrame;
import javax.swing.*;
import java.awt.*;

public class SplashFramePanel extends JPanel {

    private boolean isStartButtonClicked = false;

    SplashFrame jFrame;

    public SplashFramePanel(SplashFrame parent) {
        this.jFrame = parent;
        initializeComponents();
    }

    private void initializeComponents() {
        setLayout(new BorderLayout());
        JButton startButton = createStartButton();
        JButton exitButton = createExitButton();
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2, 0, 0));
        buttonsPanel.add(startButton);
        buttonsPanel.add(exitButton);
        add(buttonsPanel, BorderLayout.SOUTH);
        JPanel informationPanel = createInformationPanel();
        add(informationPanel, BorderLayout.CENTER);
    }

    private JButton createStartButton() {
        JButton startButton = new JButton("Start");
        startButton.addActionListener(e -> clickStartButton());
        return startButton;
    }

    private JButton createExitButton() {
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));
        return exitButton;
    }

    private JPanel createInformationPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridwidth = 2;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(0, 10, 30, 10);
        panel.add(createHeadLabel(), constraints);
        constraints.gridy = 1;
        panel.add(createBodyLabel(), constraints);
        constraints.gridwidth = 1;
        constraints.gridy = 2;
        constraints.gridx = 1;
        panel.add(createInfoLabel(), constraints);
        return panel;
    }

    private JLabel createHeadLabel() {
        JLabel headLabel = new JLabel("<html><center><h2>"
                + "Белорусский национальный технический университет<br>"
                + "Факультет информационных технологий и робототехники<br>"
                + "Кафедра программного обеспечения информационных систем "
                + "и технологий<br></h2></center></html>");
        headLabel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        return headLabel;
    }

    private JLabel createBodyLabel() {
        JLabel bodyLabel = new JLabel("<html><center><h1>Курсовой проект<br>"
                + "по дисциплине «Программирование на языке Java»<br>"
                + "на тему «Движение в однородном графитационном поле»<br></h1></center></html>");
        bodyLabel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        return bodyLabel;
    }

    private JLabel createInfoLabel() {
        return new JLabel("<html><h2>"
                + "Выполнил: студент группы 10702319<br>"
                + "Бородовский Анрей Александрович<br><br>"
                + "Преподаватель: доц. Сидорик Валерий Владимирович<br>"
                + "<br></h2></html>");
    }

    protected boolean isStartButtonClicked() {
        return isStartButtonClicked;
    }

    private void clickStartButton() {
        isStartButtonClicked = !isStartButtonClicked;
        jFrame.start();

    }
}

