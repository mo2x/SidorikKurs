package Main;

import DataManager.DataManager;
import window.MainWindow;

public class Program {
    public static DataManager dataManager = new DataManager();
    public static MainWindow mainWindow;
    public static void main(String[] args) {
        mainWindow = new MainWindow();
    }
}
