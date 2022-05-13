package EventListeners;

import windows.AboutAuthorDialog;
import windows.AboutProgramDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Событие ывзывает диалогове окно {@link AboutProgramDialog}
 * @author Borodovsky A.A
 * @version 1.0
 */
public class ProgramDialogEvent implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        AboutProgramDialog aboutProgramDialog = new AboutProgramDialog();
        aboutProgramDialog.setVisible(true);
    }
}
