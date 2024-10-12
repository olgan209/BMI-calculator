package org.example.bmi_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField weightTextField;
    @FXML
    private TextField heightTextField;
    @FXML
    private Label welcomeText;
    @FXML
    private Button calculateButtonEU;

    @FXML
    protected void calculateEnUn(){
        double weight = Double.parseDouble(weightTextField.getText());
        double height = Double.parseDouble(heightTextField.getText());
        double bmi = (weight / (height * height)) * 703;
        if(bmi < 18.5){
            welcomeText.setText("Underweight:\tless than 18.5");
        }
        else if(bmi > 18.5 && bmi < 24.9) {
            welcomeText.setText("Normal:\tbetween 18.5 and 24.9");
        }
        else if(bmi > 24.9 && bmi < 29.9) {
            welcomeText.setText("Overweight:\tbetween 25 and 29.9");
        }
        else if(bmi > 30) {
            welcomeText.setText("Obese:\t30 or greater");
        }
    }

    @FXML
    protected void calculateMeUn(){
        double weight = Double.parseDouble(weightTextField.getText());
        double height = Double.parseDouble(heightTextField.getText());
        double bmi = weight / (height * height);

        if(bmi < 18.5){
            welcomeText.setText("Underweight:\tless than 18.5");
        }
        else if(bmi > 18.5 && bmi < 24.9) {
            welcomeText.setText("Normal:\tbetween 18.5 and 24.9");
        }
        else if(bmi > 24.9 && bmi < 29.9) {
            welcomeText.setText("Overweight:\tbetween 25 and 29.9");
        }
        else if(bmi > 30) {
            welcomeText.setText("Obese:\t30 or greater");
        }
    }


}