package windows;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * клас расширенный из клсса {@link JFileChooser} для вывставления фильтра на dat файлы
 * @author Borodovsky A.A
 * @version 1.0
 */
public class DatFileChooser extends JFileChooser {

    public DatFileChooser(){
        FileNameExtensionFilter filter = new FileNameExtensionFilter("dat file","dat");
        setFileFilter(filter);
        setFileSelectionMode(FILES_AND_DIRECTORIES);
    }
}
