/*
Charles Brown
CITC-1311-C01-Programming II
Sept. 23, 2023
*/
package com.murach.teamlineup;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;



public class Team_Lineup extends Application {
    

    private final TextField nameField = new TextField();
    private final ToggleGroup siteToggle = new ToggleGroup();
    private final TextField player1 = new TextField();
    private final TextField player2 = new TextField();
    private final TextField player3 = new TextField();
    private final TextField player4 = new TextField();
    private final TextField player5 = new TextField();
    private final TextField player6 = new TextField();
    private final TextField player7 = new TextField();
    private final TextField player8 = new TextField();
    private final TextField player9 = new TextField();
    private final ComboBox<String> positionCombo1 = new ComboBox<>();
    private final ComboBox<String> positionCombo2 = new ComboBox<>();
    private final ComboBox<String> positionCombo3 = new ComboBox<>();
    private final ComboBox<String> positionCombo4 = new ComboBox<>();
    private final ComboBox<String> positionCombo5 = new ComboBox<>();
    private final ComboBox<String> positionCombo6 = new ComboBox<>();
    private final ComboBox<String> positionCombo7 = new ComboBox<>();
    private final ComboBox<String> positionCombo8 = new ComboBox<>();
    private final ComboBox<String> positionCombo9 = new ComboBox<>();
    String[] positions = {"Pitcher", "Catcher", "First Base", "Second Base", "Third Base", "Short Stop", "Left Field", "Center Field", "Right Field"};
    
    @Override
    public void start(Stage stage) {
        stage.setTitle("Team Lineup");
        VBox vbox = new VBox(10);
        
        //Team Name
        HBox teamInfo = new HBox(10); 
        Label teamName = new Label("Team Name:");
        nameField.setMinWidth(209);
        
        RadioButton homeButton = new RadioButton("Home");
        homeButton.setToggleGroup(siteToggle);
        homeButton.setSelected(true);
        RadioButton awayButton = new RadioButton("Away");
        awayButton.setToggleGroup(siteToggle);
        
        teamInfo.getChildren().add(teamName);
        teamInfo.getChildren().add(nameField);
        teamInfo.getChildren().add(homeButton);
        teamInfo.getChildren().add(awayButton);
        vbox.getChildren().add(teamInfo);
        
        //Position1
        HBox pos1 = new HBox(10);
        Label posLabel = new Label("1:");
        player1.setMinWidth(209);
        positionCombo1.setPromptText("Position");
        positionCombo1.getItems().addAll(Arrays.asList(positions));

        pos1.getChildren().add(posLabel);
        pos1.getChildren().add(player1);
        pos1.getChildren().add(positionCombo1);
        vbox.getChildren().add(pos1);
        
        //Position2
        HBox pos2 = new HBox(10);
        Label posLabel2 = new Label("2:");
        player2.setMinWidth(209);
        positionCombo2.setPromptText("Position");
        positionCombo2.getItems().addAll(Arrays.asList(positions));
        
        pos2.getChildren().add(posLabel2);
        pos2.getChildren().add(player2);
        pos2.getChildren().add(positionCombo2);
        vbox.getChildren().add(pos2);
        
        //Position3
        HBox pos3 = new HBox(10);
        Label posLabel3 = new Label("3:");
        player3.setMinWidth(209);
        positionCombo3.setPromptText("Position");
        positionCombo3.getItems().addAll(Arrays.asList(positions));
        
        pos3.getChildren().add(posLabel3);
        pos3.getChildren().add(player3);
        pos3.getChildren().add(positionCombo3);
        vbox.getChildren().add(pos3);

        
        //Position4
        HBox pos4 = new HBox(10);
        Label posLabel4 = new Label("4:");
        player4.setMinWidth(209);
        positionCombo4.setPromptText("Position");
        positionCombo4.getItems().addAll(Arrays.asList(positions));
        
        pos4.getChildren().add(posLabel4);
        pos4.getChildren().add(player4);
        pos4.getChildren().add(positionCombo4);
        vbox.getChildren().add(pos4);
        
        //Position5
        HBox pos5 = new HBox(10);
        Label posLabel5 = new Label("5:");
        player5.setMinWidth(209);
        positionCombo5.setPromptText("Position");
        positionCombo5.getItems().addAll(Arrays.asList(positions));
        
        pos5.getChildren().add(posLabel5);
        pos5.getChildren().add(player5);
        pos5.getChildren().add(positionCombo5);
        vbox.getChildren().add(pos5);
        
        //Position6
        HBox pos6 = new HBox(10);
        Label posLabel6 = new Label("6:");
        player6.setMinWidth(209);
        positionCombo6.setPromptText("Position");
        positionCombo6.getItems().addAll(Arrays.asList(positions));
        
        pos6.getChildren().add(posLabel6);
        pos6.getChildren().add(player6);
        pos6.getChildren().add(positionCombo6);
        vbox.getChildren().add(pos6);

        
        //Position7
        HBox pos7 = new HBox(10);
        Label posLabel7 = new Label("7:");
        player7.setMinWidth(209);
        positionCombo7.setPromptText("Position");
        positionCombo7.getItems().addAll(Arrays.asList(positions));
        
        pos7.getChildren().add(posLabel7);
        pos7.getChildren().add(player7);
        pos7.getChildren().add(positionCombo7);
        vbox.getChildren().add(pos7);

        
        //Position8
        HBox pos8 = new HBox(10);
        Label posLabel8 = new Label("8:");
        player8.setMinWidth(209);
        positionCombo8.setPromptText("Position");
        positionCombo8.getItems().addAll(Arrays.asList(positions));
        
        pos8.getChildren().add(posLabel8);
        pos8.getChildren().add(player8);
        pos8.getChildren().add(positionCombo8);
        vbox.getChildren().add(pos8);
        
        
        //Position9
        HBox pos9 = new HBox(10);
        Label posLabel9 = new Label("9:");
        player9.setMinWidth(209);
        positionCombo9.setPromptText("Position");
        positionCombo9.getItems().addAll(Arrays.asList(positions));
        
        pos9.getChildren().add(posLabel9);
        pos9.getChildren().add(player9);
        pos9.getChildren().add(positionCombo9);
        vbox.getChildren().add(pos9);
        
        //Input Buttons
        HBox buttons = new HBox(10);
        Button acceptButton = new Button("Accept");
        acceptButton.setOnAction(event -> acceptButtonClicked());
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(event -> System.exit(0));
        buttons.getChildren().add(acceptButton);
        buttons.getChildren().add(exitButton);
        vbox.getChildren().add(buttons);
        
        vbox.setPadding(new Insets(10, 10, 10, 10));
        Scene scene = new Scene(vbox, 450, 400);
        stage.setScene(scene);
        stage.show();
    }
    
    public void acceptButtonClicked() {
        Validation v = new Validation();
        String errorMsg = "";
        errorMsg += v.isPresent(nameField.getText(), "Team Name");
        errorMsg += v.isPresent(player1.getText(), "Position");
        errorMsg += v.isPresent(player2.getText(), "Position");
        errorMsg += v.isPresent(player3.getText(), "Position");
        errorMsg += v.isPresent(player4.getText(), "Position");
        errorMsg += v.isPresent(player5.getText(), "Position");
        errorMsg += v.isPresent(player6.getText(), "Position");
        errorMsg += v.isPresent(player7.getText(), "Position");
        errorMsg += v.isPresent(player8.getText(), "Position");
        errorMsg += v.isPresent(player9.getText(), "Position");
        
        if(errorMsg.isEmpty()) {
        
            //Preprocess
            RadioButton selectedSite = (RadioButton) siteToggle.getSelectedToggle();
            String pos1 = positionCombo1.getSelectionModel().getSelectedItem();
            String pos2 = positionCombo2.getSelectionModel().getSelectedItem();
            String pos3 = positionCombo3.getSelectionModel().getSelectedItem();
            String pos4 = positionCombo4.getSelectionModel().getSelectedItem();
            String pos5 = positionCombo5.getSelectionModel().getSelectedItem();
            String pos6 = positionCombo6.getSelectionModel().getSelectedItem();
            String pos7 = positionCombo7.getSelectionModel().getSelectedItem();
            String pos8 = positionCombo8.getSelectionModel().getSelectedItem();
            String pos9 = positionCombo9.getSelectionModel().getSelectedItem();

            String outputString =
                    nameField.getText() + "(" + selectedSite.getText() + ")" + "\n"
                    + "Player 1: " + player1.getText() + ", " + pos1 + "\n"
                    + "Player 2: " + player2.getText() + ", " + pos2 + "\n"
                    + "Player 3: " + player3.getText() + ", " + pos3 + "\n"
                    + "Player 4: " + player4.getText() + ", " + pos4 + "\n"
                    + "Player 5: " + player5.getText() + ", " + pos5 + "\n"
                    + "Player 6: " + player6.getText() + ", " + pos6 + "\n"
                    + "Player 7: " + player7.getText() + ", " + pos7 + "\n"
                    + "Player 8: " + player8.getText() + ", " + pos8 + "\n"
                    + "Player 9: " + player9.getText() + ", " + pos9;

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Message");
            alert.setHeaderText("Lineup");
            alert.setContentText(outputString);
            alert.showAndWait();
        }
        else {
            Alert alert2 = new Alert(Alert.AlertType.ERROR);
            alert2.setHeaderText("Invalid Data");
            alert2.setContentText(errorMsg);
            alert2.showAndWait();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}