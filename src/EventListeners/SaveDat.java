package EventListeners;

import Main.Program;
import window.parts.DatFileChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveDat implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        save();
    }
    public boolean save() {
        DatFileChooser datFileChooser = new DatFileChooser();
        datFileChooser.setDialogTitle("Сохранение файла");
        datFileChooser.setFileSelectionMode(DatFileChooser.FILES_ONLY);
        int result = datFileChooser.showSaveDialog(Program.mainWindow);
        if (result == DatFileChooser.APPROVE_OPTION ){
            try {
                Program.dataManager.dataSave();
                String name = datFileChooser.getSelectedFile().getAbsolutePath();
                if (!name.endsWith(".dat"))
                    name = name + ".dat";
                ObjectOutputStream objectOutputStream =
                        new ObjectOutputStream(new FileOutputStream(name));
                objectOutputStream.writeObject(Program.dataManager);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } else {
            return false;
        }
        Program.mainWindow.repaint();
        return true;
    }
}
