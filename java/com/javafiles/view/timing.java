
//Second Page


package com.javafiles.view;

import com.javafiles.controller.authcontroller;
import com.javafiles.model.UserDetail;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class timing {
    private Stage prstage;
    private Scene timingScene;
    private Scene imagesScene;
 private authcontroller c2w_pi_authController = new authcontroller(); // Controller for user-related operations
    public void settiming(Stage prstage) {
        this.prstage = prstage;
    }

    public void settimingScene(Scene timingScene) {
        this.timingScene = timingScene;
    }

    public Pane createtimingScene(Runnable timingBackHandler) {

        Label c2w_pi_title = new Label("Welcome Back"); // Title label

        c2w_pi_title.setStyle("-fx-font-size:40 ;-fx-font-weight:bold; -fx-pref-width: 600; -fx-pref-height: 30; -fx-alignment :CENTER; -fx-text-fill:#FFFFFF");
   
        Label lb = new Label("VERIFICATION");
        lb.setFont(new Font(40));
        lb.setTextFill(Color.YELLOW);
        lb.setLayoutX(750);
        lb.setLayoutY(100);
        lb.setStyle("-fx-font-weight:bold");

        VBox c2w_pi_header = new VBox(10, c2w_pi_title,lb); // Header VBox containing logo and title
        c2w_pi_header.setAlignment(Pos.CENTER);
        
        Label emailid = new Label(" Enter Your EMAIL-ID ");
        emailid.setStyle(" -fx-text-fill:WHITE");
        emailid.setFont(new Font(30));
        // emailid.setLayoutY(80);
        // emailid.setPrefWidth(100);
        emailid.setTextFill(Color.YELLOW);

        TextField ansemail = new TextField();
        ansemail.setFont(new Font(25));
        ansemail.setMaxWidth(500);
        ansemail.setPromptText("Enter Mail-Id");
        ansemail.setStyle("-fx-background-radius:20");

       /*
        Label code = new Label("Enter The Code Recieved On Email- ID ");
        code.setFont(new Font(30));
        // code.setLayoutY(80);
        // code.prefWidth(500);
        code.setStyle(" -fx-text-fill:white");

        TextField anscode = new TextField();
        anscode.setFont(new Font(25));
        anscode.setMaxWidth(500);
        anscode.setPromptText("Enter code");
        anscode.setStyle("-fx-background-radius:20");
*/
        Label elid = new Label("Enter The Election-Card ID ");
        elid.setStyle(" -fx-text-fill:WHITE");
        elid.setFont(new Font(25));
        // elid.setLayoutY(80);
        elid.setTextFill(Color.WHITE);

        TextField anselid = new TextField();
        anselid.setFont(new Font(25));
        anselid.setMaxWidth(500);
        anselid.setPromptText("Enter Election Card Id");
        anselid.setStyle("-fx-background-radius:20");

        Label safID = new Label("Enter The Safety-ID ");
        // safID.setStyle(" -fx-text-fill:WHITE");
        safID.setStyle(" -fx-text-fill:WHITE");
        safID.setFont(new Font(30));
        // safID.setLayoutY(80);
        elid.setTextFill(Color.WHITE);

        TextField anssafid = new TextField();
        anssafid.setFont(new Font(25));
        anssafid.setMaxWidth(500);
        anssafid.setPromptText("Enter Safety-ID");
        anssafid.setStyle("-fx-background-radius:20");

        Button previous = new Button("Previous");
        previous.setFont(new Font(25));
        previous.setTextFill(Color.BLACK);
        previous.setLayoutX(25);
        previous.setPrefWidth(200);
        previous.setStyle("-fx-background-color:Aqua");
        previous.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                System.out.println(previous.getText());

                // previous.setStyle("-fx-background-color:GREEN");
                timingBackHandler.run();
                prstage.show();
            }
        });
        Button next = new Button("Next");
        // next.setAlignment(Pos.CENTER);
        next.setFont(new Font(25));
        next.setTextFill(Color.BLACK);
        next.setLayoutX(5);
        next.setPrefWidth(200);
        next.setStyle("-fx-background-radius:20");
        // next.setPrefWidth(150);
        next.setStyle("-fx-background-color:Aqua");
        next.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
               
            if (!ansemail.getText().isEmpty()  && !anselid.getText().isEmpty() && !(anssafid.getText().isEmpty())) {
            System.out.println("after if");
                    if (c2w_pi_authController.authenticateUser(ansemail.getText(), anselid.getText(),anssafid.getText())) {
                        
                        System.out.println("<-----after if");
                            System.out.print("IN SECOND IF of Login Auth...");
                            /*ImageView tick = new ImageView("images/GIFtickmark.gif");
                            tick.setFitWidth(80);
                            tick.setPreserveRatio(true);
                           tick.setLayoutX(150);
                           HBox hb1tick=new HBox(tick);
                           hb1tick.setAlignment(Pos.TOP_CENTER);
                           */
                          navigateToimages();
                          prstage.show();

                       // UserDetail c2w_pi_userDetail = c2w_pi_userController.getUserDetail(user_tx.getText());

                       
                    // } else {
                    //     // c2w_pi_output.setText("Invalid Username or Password"); // Show error message
                    //     System.out.println("Invalid Username or Password");
                    // }
                } else {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Login");
                     alert.setHeaderText("Username or Password is Incorrect.Please Enter Valid Details !!!");
                    // alert.setContentText("I have a great message for you!");
                    alert.showAndWait().ifPresent(rs -> {
                            });
                    // c2w_pi_output.setText("Please Enter Username and Password"); // Show error
                    // message
                    System.out.println("Please Enter Username and Password");
                }
            }

      
               
            }
        });

        HBox hb = new HBox(100, previous, next);

        VBox vb1 = new VBox(30, c2w_pi_header,emailid, ansemail, elid, anselid, safID, anssafid, hb);
        // vb1.setPrefWidth(1200);
        vb1.setLayoutX(650);
        vb1.setLayoutY(100);

        // vb1.setPadding(new Insets(200, 300, 600, 700));

        // vb1.setPrefWidth(1000);
        Pane gb = new Pane(vb1);
        gb.setStyle("-fx-background-image: url('images/thumb.jpg');-fx-background-size:cover");
        gb.setPrefSize(1980, 950);

        return gb;
    }

    public void navigateToimages() {
        images images = new images();
        imagesScene = new Scene(images.createimagesScene(this::handleBack), 1980, 1000);
        images.setimagesScene(imagesScene);
        images.setimages(prstage);
        prstage.setScene(imagesScene);
        prstage.show();
    }

    void handleBack() {
        prstage.setScene(timingScene);
        // vb1.setBackground(new ImagePattern(new Image("Login_Screen_bg.jpg")));

    }
}
