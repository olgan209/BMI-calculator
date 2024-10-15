package org.example.bmi_calculator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

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
    private MenuBar menuBar;

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

    @FXML
    protected void showHelp(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("help-dialog.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Help");
            stage.setScene(new Scene(root));

            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void exitAction() {
        Platform.exit();
    }
    @FXML
    protected void clearFields(){
        kgTextField.clear();
        mTextField.clear();
        feetTextField.clear();
        inchestTextField.clear();
        poundsTextField.clear();
        welcomeText.setText("Welcome! It is a BMI calculator");
    }
}