package EventListeners;

import windows.AboutAuthorDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthorDialogEvent implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        AboutAuthorDialog aboutAuthorDialog = new AboutAuthorDialog();
        aboutAuthorDialog.setVisible(true);
    }
}
