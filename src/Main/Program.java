package Main;

import DataManager.DataManager;
import windows.MainWindow;
import windows.SplashFrame;
import windows.parts.SplashFramePanel;

import java.awt.*;

public class Program {
    public static DataManager dataManager = new DataManager();
    public static MainWindow mainWindow;
    public static void main(String[] args) {
        //mainWindow = new MainWindow();
        new SplashFrame();
    }
}
