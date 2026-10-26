/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab09_harelrajendram;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author macos
 */
public class ColorChooser {
    
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;
    
    
    
    @FXML
    private Label alphaLabel;

    @FXML
    private Slider alphaSlider;

    @FXML
    private TextField alphaTextField;

    @FXML
    private Label blueLabel;

    @FXML
    private Slider blueSlider;

    @FXML
    private TextField blueTextField;

    @FXML
    private Circle colorCircle;

    @FXML
    private Rectangle colorRectangle;

    @FXML
    private Label greenLabel;

    @FXML
    private Slider greenSldier;

    @FXML
    private TextField greenTextField;

    @FXML
    private Label redLabel;

    @FXML
    private Slider redSlider;

    @FXML
    private TextField redTextField;
    
    public void initialize() {
        
        
    redTextField.textProperty().bind(
 redSlider.valueProperty().asString("%.0f")); 
    
    greenTextField.textProperty().bind(
 greenSldier.valueProperty().asString("%.0f")); 
    
    blueTextField.textProperty().bind(
 blueSlider.valueProperty().asString("%.0f")); 
    
    alphaTextField.textProperty().bind(
 alphaSlider.valueProperty().asString("%.0f")); 
    }
}
