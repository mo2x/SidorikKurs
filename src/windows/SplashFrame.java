package windows;

import EventListeners.ActivityListener;
import Main.Program;
import windows.parts.SplashFramePanel;

import javax.swing.*;

/**
 * Окно которое имеет основную информацию с переводом к программе и выходом
 * По прошестыию 60 секунд выходит из приложения
 * @author Borodovsky A.A
 * @version 1.0
 */
public class SplashFrame extends JFrame {

    ActivityListener activityListener = new ActivityListener();

    public SplashFrame() {
        setUndecorated(true);
        SplashFramePanel panel = new SplashFramePanel(this);
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        activityListener.run();
    }

    public void start(){
        Program.mainWindow = new MainWindow();
        activityListener.disable();
        dispose();
    }
}
