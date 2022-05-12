package window.parts;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DatFileChooser extends JFileChooser {

    public DatFileChooser(){
        FileNameExtensionFilter filter = new FileNameExtensionFilter("dat file","dat");
        setFileFilter(filter);
        setFileSelectionMode(FILES_AND_DIRECTORIES);
    }
}
