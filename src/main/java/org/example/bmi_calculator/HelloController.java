package org.example.bmi_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField kgTextField;
    @FXML
    private TextField mTextField;
    @FXML
    private TextField feetTextField;
    @FXML
    private TextField inchestTextField;
    @FXML
    private TextField poundsTextField;


    @FXML
    private Label welcomeText;
    @FXML
    private Button calculateButtonEU;

    @FXML
    protected void calculateEnUn(){
        double pounds = Double.parseDouble(poundsTextField.getText());
        double feet = Double.parseDouble(feetTextField.getText());
        double inches = Double.parseDouble(inchestTextField.getText());
        double height = (feet * 12) +inches;
        double bmi = (703 * pounds / (height * height));
        if(bmi < 18.5){
            welcomeText.setText("Underweight:\tless than 18.5");
        }
        else if(bmi >= 18.5 && bmi < 24.9) {
            welcomeText.setText("Normal:\tbetween 18.5 and 24.9");
        }
        else if(bmi >= 24.9 && bmi < 29.9) {
            welcomeText.setText("Overweight:\tbetween 25 and 29.9");
        }
        else if(bmi >= 30) {
            welcomeText.setText("Obese:\t30 or greater");
        }
    }

    @FXML
    protected void calculateMeUn() {
        double kg = Double.parseDouble(kgTextField.getText());
        double m = Double.parseDouble(mTextField.getText());
        double bmi = kg / (m * m);

        if (bmi < 18.5) {
            welcomeText.setText("Underweight:\tless than 18.5");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            welcomeText.setText("Normal:\tbetween 18.5 and 24.9");
        } else if (bmi >= 25 && bmi < 29.9) {
            welcomeText.setText("Overweight:\tbetween 25 and 29.9");
        } else if (bmi >= 30) {
            welcomeText.setText("Obese:\t30 or greater");
        }
    }
}