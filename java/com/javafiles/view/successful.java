package com.javafiles.view;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class successful{
    private static final Node Image = null;
    private Stage prstage;
    private Scene successfulscene;


    public void setsuccessful(Stage prstage){
        this.prstage = prstage;
    }

    public void setsuccessfulScene(Scene successfulScene){
        this.successfulscene = successfulScene;
    }
    public Pane createsuccessfulScene(Runnable successfulBackHandler) {


        Label successfully = new Label();
        successfully.setText("Voting Is Successfully Done!!!!");
        successfully.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 60));
        successfully.setFont(new Font(60));
        successfully.setTextFill(Color.BLACK);
        successfully.setStyle("-fx-font-weight:bold");


        VBox vb = new VBox(20,successfully);
        vb.setPadding(new Insets(700,150,700,1100));
                vb.setStyle("-fx-background-image: url('images/succ.jpg')");


        // StackPane stackpane = new StackPane();
        // Image backgroundImage = new Image(getClass().getResourceAsStream("'Assets\\images\\succ.jpg"));
        // stackpane.setStyle("-fx-background-image: url('Assets\\images\\succ.jpg')");
        
    //   Image image = new Image(getClass().getResourceAsStream("Assets/images/succ.jpg"), 200, 200, true,  false);
    //   BackgroundSize backgroundSize = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, false);
    //   BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
    //   Background background = new Background(backgroundImage);

        VBox vb1 = new VBox(vb);
        Pane gb = new Pane(vb1);
        //gb.setStyle("-fx-background-image: url('images/succ.jpg');-fx-background-size:cover");
        gb.setStyle("-fx-background-image: url('succ.jpg');-fx-background-size:cover");
        //vb1.setBackground(background);        
        return gb;
}
}
