package EventListeners;

import DataManager.DataManager;
import Main.Program;
import windows.DatFileChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LoadDat implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        load();
    }
    public void load(){
        DatFileChooser datFileChooser = new DatFileChooser();
        datFileChooser.setDialogTitle("Загрузить dat файл");
        datFileChooser.setFileSelectionMode(DatFileChooser.FILES_ONLY);
        int result = datFileChooser.showOpenDialog(Program.mainWindow);
        if (result == DatFileChooser.APPROVE_OPTION ){
            try {
                ObjectInputStream objectInputStream =
                        new ObjectInputStream(new FileInputStream(datFileChooser.getSelectedFile()));
                Program.dataManager = (DataManager) objectInputStream.readObject();
                Program.mainWindow.simulationWin.resetChart();
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        Program.mainWindow.repaint();
    }
}
