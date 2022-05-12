package EventListeners;

import Main.Program;
import Simulation.Simulation;
import window.parts.InputComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartCalculations implements ActionListener {

    InputComponent inputComponent;

    public StartCalculations(InputComponent inputComponent){
        this.inputComponent = inputComponent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Simulation simulation = new Simulation();
        try {
            simulation.start(
                    inputComponent.getInputWeight(),
                    inputComponent.getInputAngle(),
                    inputComponent.getInputHeight(),
                    inputComponent.getInputStartVelocity()
            );
            inputComponent.isCorrectInput(true);
            Program.mainWindow.simulationWin.resetChart();
        }catch (Exception exception) {
            inputComponent.isCorrectInput(false);
        }

    }
}
