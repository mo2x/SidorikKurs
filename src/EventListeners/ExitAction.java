package EventListeners;

import Main.Program;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Класс событие обрабатывает ывход из приложения
 * и предлагает сохранить данные, если этого небыло сделанно
 * @author Borodovsky A.A
 * @version 1.0
 */
public class ExitAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        askUser();
    }
    public void askUser(){
        if (Program.dataManager.isSaved) System.exit(0);
        int ans = JOptionPane.showConfirmDialog(null,
                "Вы хотите сохранить данные перед выходом");
        if (ans == 1){
            System.exit(0);
        } else if (ans == 0){
            SaveDat dat = new SaveDat();
            if (dat.save()){
                System.exit(0);
            }
        }
    }
}
