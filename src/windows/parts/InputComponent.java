package windows.parts;

import EventListeners.StartCalculations;

import javax.swing.*;
import java.awt.*;
/**
 * компонент, который содержит в себе окна для ввода начальных данных броска
 * и кнопку для начала рассчета
 * @author Borodovsky A.A
 * @version 1.0
 */
public class InputComponent extends WorkPanelPart {

    private final TextField tFWeight = new TextField();
    private final TextField tFHeight = new TextField();
    private final TextField tFStartVelocity = new TextField();
    private final TextField tFAngle = new TextField();

    public InputComponent(){
        setLayout(new GridBagLayout());

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        setBorderColor(Color.BLACK);
        setTitleName("Вводные данные");
        //делаем подпись для поля ввода массы
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0;
        Label weightLabel = new Label("Масса (кг)");
        add(weightLabel,gridBagConstraints);
        //вставляем поле для ввода массы
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.ipadx = 50;
        add(tFWeight,gridBagConstraints);
        //делаем подпись для поля ввода высоты
        gridBagConstraints.ipadx = 0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0;
        Label heightLabel = new Label("Высота (м)");
        add(heightLabel,gridBagConstraints);
        //вставляем поле для ввода высоты
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1;
        add(tFHeight,gridBagConstraints);
        //делаем подпись для поля ввода начальной скорости
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0;
        Label startVelocityLabel = new Label("Начальная скорость (м/c)");
        add(startVelocityLabel,gridBagConstraints);
        //вставляем поле для ввода начальной скорости
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1;
        add(tFStartVelocity,gridBagConstraints);
        //делаем подпись для поля ввода угла броска
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0;
        Label angleLabel = new Label("Угол броска (deg)");
        add(angleLabel,gridBagConstraints);
        //вставляем поле для ввода угла броска
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1;
        add(tFAngle,gridBagConstraints);
        //кнопка для начала рассчета
        JButton runButton = new JButton();
        runButton.setText("Рассчитать");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.gridwidth = 2;
        add(runButton,gridBagConstraints);
        runButton.addActionListener(new StartCalculations(this));
    }

    public double getInputWeight() {
        return Double.parseDouble(tFWeight.getText());
    }

    public double getInputAngle() {
        return Double.parseDouble(tFAngle.getText());
    }

    public double getInputStartVelocity() {
        return Double.parseDouble(tFStartVelocity.getText());
    }

    public double getInputHeight() {
        return Double.parseDouble(tFHeight.getText());
    }

    public void isCorrectInput(boolean correct){
        if (!correct){
            setBorderColor(Color.red);
        } else {
            setBorderColor(Color.BLACK);
        }
    }
}
