package com.javafiles.view;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import com.javafiles.controller.PlayerController;
import com.javafiles.dao.PlayerDao;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class images2 {
  private Stage prstage;
  private Scene imagesScene;
  private Scene images2Scene;
  private Scene successfulScene;
  private PlayerController playerController = new PlayerController();

  public void setimages2(Stage prstage) {
    this.prstage = prstage;
  }

  public void setimages2Scene(Scene imagesScene) {
    this.images2Scene = images2Scene;
  }

  public VBox createimages2Scene(Runnable images2BackHandler) {

    // PlayerController pc=new PlayerController();
    ///////////////////// 1)AAM/////////////////////////

    Label lb = new Label("Reconfirm Your Vote......");
    lb.setFont(new Font(60));
    lb.setTextFill(Color.RED);
    lb.setStyle("-fx-font-weight:bold");

    Image ig1 = new Image("images/aap.png");
    ImageView iv1 = new ImageView(ig1);
    iv1.setFitWidth(300);
    iv1.setFitHeight(200);

    Button bAAM = new Button("Aam Admi Party");

    // HBox pane = new HBox(15);
    // pane.getChildren().addAll(bAAM);

    bAAM.setLayoutY(400);

    bAAM.setStyle("-fx-background-color: GREY;" + "-fx-text-fill: YELLOW; ");
    bAAM.setFont(new Font(20));
    bAAM.setPrefWidth(300);
    bAAM.setPrefHeight(200);
    bAAM.setOnMouseClicked(new EventHandler<MouseEvent>() {

      public void handle(MouseEvent event) {
        System.out.println("aaaaaaaaaaaaaaaaaa");
         playerController.updateVote("parties", "AAP", "abc");
      //  PlayerDao.updateVote(String , String Vote , String user);
        navigateTosuccessful();
      }
    });
    HBox hbb1 = new HBox(45, iv1, bAAM);
    hbb1.setStyle("-fx-background-color:gray");
////////////////////////////////// 2)BSP///////////////////////////

    Image ig3 = new Image("images/bsp.png");

    ImageView iv3 = new ImageView(ig3);
    iv3.setFitWidth(300);
    iv3.setFitHeight(200);

    Button bBSP = new Button("Bahujan Samaj Party");
    bBSP.setAlignment(Pos.CENTER);
    bBSP.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        playerController.updateVote("parties", "BSP", "abc");
        navigateTosuccessful();
        prstage.show();

      }
    });
    bBSP.setStyle("-fx-background-color: GREY;" + "-fx-text-fill: YELLOW; ");
    bBSP.setFont(new Font(20));
    bBSP.setPrefWidth(300);
    bBSP.setPrefHeight(200);

    HBox hbb3 = new HBox(45, iv3, bBSP);

    hbb3.setStyle("-fx-background-color:GREY");
    hbb3.setOnMouseClicked(new EventHandler<MouseEvent>() {

      public void handle(MouseEvent event) {
        playerController.updateVote("parties", "BSP", "abc");
               navigateTosuccessful();
      }
    });
    ////////////////////////// 3)NPP//////////////////////////////

    Image ig7 = new Image("images/npp.jpg");

    ImageView iv7 = new ImageView(ig7);
    iv7.setFitWidth(300);
    iv7.setFitHeight(200);

    Button bNPP = new Button("National People Party");

    bNPP.setOnAction(new EventHandler<ActionEvent>() {

      public void handle(ActionEvent event) {
        // navigateTosuccessful();
        bNPP.setStyle("-fx-background-color: GREEN;");
        playerController.updateVote("parties", "NPP", "abc");
        navigateTosuccessful();
        prstage.show();
      }
    });
    bNPP.setStyle("-fx-background-color: GREY;" + "-fx-text-fill: YELLOW; ");

    bNPP.setFont(new Font(20));
    bNPP.setPrefWidth(300);
    bNPP.setPrefHeight(200);

    HBox hbb5 = new HBox(45, iv7, bNPP);

    hbb5.setStyle("-fx-background-color:GREY");

    ////////////////////////// 4)BJP////////////////////////

    Image ig2 = new Image("images/bjp.jpg");

    ImageView iv2 = new ImageView(ig2);
    iv2.setFitWidth(300);
    iv2.setFitHeight(200);

    Button bBJP = new Button("Bhartiya Janata Party");

    bBJP.setOnAction(new EventHandler<ActionEvent>() {

      public void handle(ActionEvent event) {
        bBJP.setStyle("-fx-background-color:GREEN;");
        playerController.updateVote("parties", "BJP", "abc");

        navigateTosuccessful();
      }
    });
    bBJP.setStyle("-fx-background-color: GREY;" + "-fx-text-fill: YELLOW; ");
    bBJP.setFont(new Font(20));
    bBJP.setPrefWidth(300);
    bBJP.setPrefHeight(200);
    HBox hbb2 = new HBox(45, iv2, bBJP);
    hbb2.setStyle("-fx-background-color:GREY");

    //////////////// 5)CPI/////////////////////////////////////
    Image ig4 = new Image("images/cpi.png");

    ImageView iv4 = new ImageView(ig4);
    iv4.setFitWidth(300);
    iv4.setFitHeight(200);

    Button bCPI = new Button("Communist Party Of India");

    bCPI.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        playerController.updateVote("parties", "CPI", "abc");
        
        navigateTosuccessful();
         prstage.show();
        
      }
    });
    bCPI.setStyle("-fx-background-color: GREY;" + "-fx-text-fill: YELLOW; ");
    bCPI.setFont(new Font(20));
    bCPI.setPrefWidth(300);
    bCPI.setPrefHeight(200);
    HBox hbb4 = new HBox(45, iv4, bCPI);
    hbb4.setStyle("-fx-background-color:GREY");

    ///////////// 6)NCP///////////////////////////////
    Image ig6 = new Image("images/ncp.jpg");

    ImageView iv6 = new ImageView(ig6);
    iv6.setFitWidth(300);
    iv6.setFitHeight(200);

    TextField txNCP = new TextField();
    Label lNCP = new Label();
    Button bNCP = new Button("Nationalist Congress Party");

    bNCP.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {

        playerController.updateVote("parties", "NCP", "abc");
        navigateTosuccessful();
        prstage.show();        
      }
    });
    bNCP.setStyle("-fx-background-color: gray;" + "-fx-text-fill: yellow; ");
    bNCP.setFont(new Font(20));
    bNCP.setPrefWidth(300);
    bNCP.setPrefHeight(200);
    HBox hbb6 = new HBox(45, iv6, bNCP);
    hbb6.setStyle("-fx-background-color:gray");

    // TextField txAAM=new TextField();
    // Label lAAM=new Label();

    Button confirm = new Button("Confirm");

    confirm.setLayoutX(30);
    confirm.setPrefWidth(150);
    confirm.setStyle(" -fx-text-fill : black;-fx-background-radius:30; -fx-font-size: 30; -fx-font-weight:bold");
    confirm.setOnMouseEntered(event -> confirm
        .setStyle("-fx-background-color:green ; -fx-background-radius:30; -fx-font-size: 30; -fx-font-weight:bold"));
    confirm.setOnMouseExited(event -> confirm
        .setStyle("-fx-text-fill : black; -fx-background-radius:30; -fx-font-size: 30; -fx-font-weight:bold"));
    // confirm.setOnAction(e->extracted(dialog));
    confirm.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        navigateTosuccessful();
        prstage.show();

      }
    });

    HBox vbox = new HBox(100, confirm);
    // vbox.setPadding(new Insets(905, 50, 50, 1700));

    // VBox vb2 = new VBox(20, hbb2, hbb4, hbb6);
    // vb2.setLayoutY(125);
    // vb2.setLayoutX(100);
    // vb2.setScaleY(1.3);
    // vb2.setScaleX(1.5);

    VBox vb3 = new VBox(lb);
    // vb3.setPadding(new Insets(10, 900, 10, 10));

    // HBox hb = new HBox(400, vb, vb2);
    // hb.setLayoutY(200);
    // hb.setLayoutX(100);
    GridPane gridPane = new GridPane();
    gridPane.setHgap(60);
    gridPane.setVgap(60);
    gridPane.add(hbb1, 0, 0);
    gridPane.add(hbb2, 1, 0);
    gridPane.add(hbb3, 0, 1);
    gridPane.add(hbb4, 1, 1);
    gridPane.add(hbb5, 0, 2);
    gridPane.add(hbb6, 1, 2);

    VBox gp = new VBox(40,vb3, gridPane);
    gp.setPadding(new Insets(50, 150, 400, 300));
    gp.setPrefHeight(300);
    gp.setPrefWidth(200);
    gp.setStyle("-fx-background-image: url('blur6.jpg');-fx-background-size:cover");
    return gp;
  }

  public void navigateTosuccessful() {
    successful successful = new successful();
    successfulScene = new Scene(successful.createsuccessfulScene(this::handleBack), 1980, 990);
    successful.setsuccessfulScene(successfulScene);
    successful.setsuccessful(prstage);
    prstage.setScene(successfulScene);
    prstage.show();
  }

  void handleBack() {
    prstage.setScene(images2Scene);
  }
}

// sc.setFill(new ImagePattern(new Image("black.jpg")));
