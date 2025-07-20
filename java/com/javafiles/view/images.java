package com.javafiles.view;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import com.javafiles.controller.PlayerController;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

public class images {
  private Stage prstage;
  private Scene imagesScene;
  private Scene images2Scene;
  private PlayerController playerController = new PlayerController();

  public void setimages(Stage prstage) {
    this.prstage = prstage;
  }

  public void setimagesScene(Scene imagesScene) {
    this.imagesScene = imagesScene;
  }

  public VBox createimagesScene(Runnable imagesBackHandler) {

    ///////////////////// 1)AAM/////////////////////////

    Image ig1 = new Image("images/aap.png");
    ImageView iv1 = new ImageView(ig1);
    iv1.setFitWidth(300);
    iv1.setFitHeight(200);

    Button bAAM = new Button("Aam Admi Party");
    bAAM.setLayoutY(400);
    
    bAAM.setStyle("-fx-background-color: gray;" + "-fx-text-fill: YELLOW; ");
    bAAM.setFont(new Font(20));
    bAAM.setPrefWidth(300);
    bAAM.setPrefHeight(200);
    bAAM.setOnMouseClicked(new EventHandler<MouseEvent>() {

      public void handle(MouseEvent event) {
        System.out.println("aaaaaaaaaaaaaaaaaa");
       // playerController.updateVote("parties", "AAP", "abc");
        //PlayerDao.updateVote(String , String Vote , String user);
        bAAM.setStyle("-fx-background-color:GREEN");
        navigateToimages2();
      }
    });
    HBox hbb1 = new HBox(45, iv1, bAAM);
    hbb1.setStyle("-fx-background-color:GREY");
    System.out.println("wwwwwwwwwwwwwww");
    // hbb1.setOnMouseClicked(new EventHandler<MouseEvent>() {

    //   public void handle(MouseEvent event) {
    //     System.out.println("aaaaaaaaaaaaaaaaaa");
    //     playerController.updateVote("parties", "AAP", "abc");
        
    //     navigateToimages2();
    //   }
    // });

    ///////////////////////////// 2) BSP///////////////////////////

    Image ig3 = new Image("images/bsp.png");

    ImageView iv3 = new ImageView(ig3);
    iv3.setFitWidth(300);
    iv3.setFitHeight(200);

    Button bBSP = new Button("Bahujan Samaj Party");
    bBSP.setAlignment(Pos.CENTER);
    bBSP.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {

        System.out.println("User Clicked on BSP");
        
        bBSP.setStyle("-fx-background-color:GREEN");
        navigateToimages2();
      }
    });
    bBSP.setStyle("-fx-background-color: GREY;" + "-fx-text-fill: YELLOW; ");
    bBSP.setFont(new Font(20));
    bBSP.setPrefWidth(300);
    bBSP.setPrefHeight(200);

    HBox hbb3 = new HBox(45, iv3, bBSP);

    hbb3.setStyle("-fx-background-color:GREY");

    /////////////////////////////////// 3)NPP//////////////////////////////

    Image ig7 = new Image("images/npp.jpg");

    ImageView iv7 = new ImageView(ig7);
    iv7.setFitWidth(300);
    iv7.setFitHeight(200);

    Button bNPP = new Button("National People Party");

    bNPP.setOnAction(new EventHandler<ActionEvent>() {

      public void handle(ActionEvent event) {
        
        System.out.println("User clicked on NPP");
        bNPP.setStyle("-fx-background-color:GREEN");
        navigateToimages2();

      }
    });
    bNPP.setStyle("-fx-background-color: GREY;" + "-fx-text-fill: YELLOW; ");

    bNPP.setFont(new Font(20));
    bNPP.setPrefWidth(300);
    bNPP.setPrefHeight(200);

    HBox hbb5 = new HBox(45, iv7, bNPP);

    hbb5.setStyle("-fx-background-color:GREY");

    // VBox vb = new VBox(20, hbb1, hbb3, hbb7);
    // vb.setLayoutY(125);
    // vb.setLayoutX(100);
    // vb.setScaleY(1.3);
    // vb.setScaleX(1.5);

    //////////////////////// 4) BJP////////////

    Image ig2 = new Image("images/bjp.jpg");

    ImageView iv2 = new ImageView(ig2);
    iv2.setFitWidth(300);
    iv2.setFitHeight(200);

    Button bBJP = new Button("Bhartiya Janata Party");
    bBJP.setOnAction(new EventHandler<ActionEvent>() {

      public void handle(ActionEvent event) {
        
        System.out.println("User clicked on BJP");
        bBJP.setStyle("-fx-background-color:GREEN;");
        navigateToimages2();
      }
    });
    bBJP.setStyle("-fx-background-color: GREY;" + "-fx-text-fill: YELLOW; ");
    bBJP.setFont(new Font(20));
    bBJP.setPrefWidth(300);
    bBJP.setPrefHeight(200);
    HBox hbb2 = new HBox(45, iv2, bBJP);
     hbb2.setStyle("-fx-background-color:GREY");
    ////////////////// 5) CPI //////////////////////////

    Image ig4 = new Image("images/cpi.png");

    ImageView iv4 = new ImageView(ig4);
    iv4.setFitWidth(300);
    iv4.setFitHeight(200);

    Button bCPI = new Button("Communist Party Of India");
    bCPI.setOnAction(new EventHandler<ActionEvent>() {

      public void handle(ActionEvent event) {
        navigateToimages2();
        System.out.println("ci");
      }
    });
    bCPI.setStyle("-fx-background-color: GREY;" + "-fx-text-fill: YELLOW; ");
    bCPI.setFont(new Font(20));
    bCPI.setPrefWidth(300);
    bCPI.setPrefHeight(200);
    HBox hbb4 = new HBox(45, iv4, bCPI);
    hbb4.setStyle("-fx-background-color:GREY");

    ////////////////// 6) NCP///////////////////////////////
    Image ig6 = new Image("images/ncp.jpg");

    ImageView iv6 = new ImageView(ig6);
    iv6.setFitWidth(300);
    iv6.setFitHeight(200);

    Button bNCP = new Button("Nationalist Congress Party");

    bNCP.setOnAction(new EventHandler<ActionEvent>() {

      public void handle(ActionEvent event) {

        System.out.println("National Congress Party");
        bNCP.setStyle("-fx-background-color:GREEN");
        navigateToimages2();
      }
    });
    bNCP.setStyle("-fx-background-color: gray;" + "-fx-text-fill: yellow; ");
    bNCP.setFont(new Font(20));
    bNCP.setPrefWidth(300);
    bNCP.setPrefHeight(200);
    HBox hbb6 = new HBox(45, iv6, bNCP);
    hbb6.setStyle("-fx-background-color:gray");

   /* Button submit = new Button("VOTE...");
    submit.setLayoutX(30);
    submit.setPrefWidth(150);
    submit.setLayoutX(30);
    submit.setStyle(" -fx-text-fill : black;-fx-background-radius:30; -fx-font-size: 30; -fx-font-weight:bold");
    submit.setOnMouseEntered(event -> submit.setStyle("-fx-background-color:green; -fx-text-fill : black; -fx-background-radius:30; -fx-font-size: 30; -fx-font-weight:bold"));
    submit.setOnMouseExited(event -> submit.setStyle("-fx-text-fill : black;-fx-background-radius:30; -fx-font-size: 30; -fx-font-weight:bold"));
    submit.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        navigateToimages2();
        prstage.show();
      }
    });

    VBox vbox = new VBox(submit);*/
    //vbox.setPadding(new Insets(905, 50, 50, 1700));

    // VBox vb2 = new VBox(20, hbb2, hbb4, hbb6);
    // vb2.setLayoutY(125);
    // vb2.setLayoutX(100);
    // vb2.setScaleY(1.3);
    // vb2.setScaleX(1.5);

    // // VBox vb3 = new VBox(submit);

    // HBox hb = new HBox(400, vb, vb2);
    // hb.setLayoutY(150);
    // hb.setLayoutX(100);
    GridPane gridPane = new GridPane();
    gridPane.setHgap(60);
    gridPane.setVgap(60);
    gridPane.setPrefHeight(1000);
    gridPane.setPrefWidth(2000);
    gridPane.add(hbb1, 0, 0);
    gridPane.add(hbb2, 1, 0);
    gridPane.add(hbb3, 0, 1);
    gridPane.add(hbb4, 1, 1);
    gridPane.add(hbb5, 0, 2);
    gridPane.add(hbb6, 1, 2);

    VBox vb = new VBox( 50,gridPane);
    vb.setPadding(new Insets(150, 150, 150, 300));
    vb.setPrefHeight(300);
    vb.setPrefWidth(200);
    
   // vb.setPrefSize(1980, 990);
    return vb;
  }

  public void navigateToimages2() {
    images2 images2 = new images2();
    images2Scene = new Scene(images2.createimages2Scene(this::handleBack), 1980, 990);
    images2.setimages2Scene(images2Scene);
    images2.setimages2(prstage);
    prstage.setScene(images2Scene);
    prstage.show();
  }

  void handleBack() {
    prstage.setScene(imagesScene);
    // prstage.setScene(loginScene);
  }
}