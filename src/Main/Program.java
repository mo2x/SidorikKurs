package Main;

import DataManager.DataManager;
import windows.MainWindow;
import windows.SplashFrame;

/**
 * точка входа в программу, а так же хранит в себе статические
 * {@link DataManager} {@link MainWindow}
 * @author Borodovsky A.A
 * @version 1.0
 */

public class Program {
    public static DataManager dataManager = new DataManager();
    public static MainWindow mainWindow;
    public static void main(String[] args) {
        new SplashFrame();
    }
}
