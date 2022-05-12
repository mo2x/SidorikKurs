package window;

import EventListeners.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;
import window.parts.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends JFrame {

    public Graphic simulationWin = new Graphic();
    public ToolComponent toolComponent = new ToolComponent();
    public JMenuBar menuBar = new JMenuBar();
    public JMenu file = new JMenu("Файл");
    public JMenuItem save = new JMenuItem("Сохранить");
    public JMenuItem load = new JMenuItem("Загрузить");
    public JMenuItem exit = new JMenuItem("Выйти");
    public JMenu help = new JMenu("Помощь");
    public JMenuItem aboutProgram = new JMenuItem("О программе");
    public JMenuItem aboutAuthor = new JMenuItem("Об Авторе");

    public MainWindow(){
        setSize(1000,500);
        ExitAction exitAction = new ExitAction();
        menuBar.add(file);
        save.addActionListener(new SaveDat());
        file.add(save);
        load.addActionListener(new LoadDat());
        file.add(load);
        file.addSeparator();
        exit.addActionListener(exitAction);
        file.add(exit);
        menuBar.add(help);
        aboutAuthor.addActionListener(new AuthorDialogEvent());
        help.add(aboutAuthor);
        aboutProgram.addActionListener(new ProgrammDialogEvent());
        help.add(aboutProgram);
        setJMenuBar(menuBar);

        setTitle("Движение в однородном гравитационном поле");
        setLayout(new BorderLayout());
        Container container = getContentPane();
        container.add(simulationWin, BorderLayout.CENTER);
        JScrollPane scrollPane = new JScrollPane(toolComponent);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        container.add(scrollPane, BorderLayout.EAST);
        setDefaultCloseOperation( DO_NOTHING_ON_CLOSE );
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                exitAction.askUser();
            }
        });
    }


}
