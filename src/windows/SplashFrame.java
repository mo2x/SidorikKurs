package windows;

import windows.parts.SplashFramePanel;

import javax.swing.*;

public class SplashFrame extends JFrame {

    private final SplashFramePanel panel;

    public SplashFrame() {
        setUndecorated(true);
        panel = new SplashFramePanel();
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
