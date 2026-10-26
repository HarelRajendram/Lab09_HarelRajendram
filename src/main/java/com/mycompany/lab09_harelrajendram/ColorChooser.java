/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab09_harelrajendram;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author macos
 */
public class ColorChooser {
    
    
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
    
     
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;
    
    
    public void initialize() {
        
        
    redTextField.textProperty().bind(
    redSlider.valueProperty().asString("%.0f")); 
    
    redSlider.valueProperty().addListener((obs,oldV,newV) -> {
    red = newV.intValue();
    colorRectangle.setFill(Color.rgb(red, blue, green, alpha));
    });
    
    
    greenTextField.textProperty().bind(
    greenSldier.valueProperty().asString("%.0f"));
    
    greenSldier.valueProperty().addListener((obs,oldV,newV) -> {
    green = newV.intValue();
    colorRectangle.setFill(Color.rgb(red, blue, green, alpha));
    
    });
    
    blueTextField.textProperty().bind(
    blueSlider.valueProperty().asString("%.0f")); 
    
    blueSlider.valueProperty().addListener((obs,oldV,newV) -> {
    blue = newV.intValue();
    colorRectangle.setFill(Color.rgb(red, blue, green, alpha));
    });
    
    alphaTextField.textProperty().bind(
    alphaSlider.valueProperty().asString("%.0f")); 
    
    alphaSlider.valueProperty().addListener((obs,oldV,newV) -> {
    alpha = newV.doubleValue();
    colorRectangle.setFill(Color.rgb(red, blue, green, alpha));
    });
    }
}
