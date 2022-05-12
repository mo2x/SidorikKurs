package EventListeners;

import windows.AboutProgramDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgrammDialogEvent implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        AboutProgramDialog aboutProgramDialog = new AboutProgramDialog();
        aboutProgramDialog.setVisible(true);
    }
}
