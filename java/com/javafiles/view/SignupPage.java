package com.javafiles.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import com.javafiles.controller.BackgroundImageController;
import com.javafiles.controller.UserController;
/**
* This class represents the signup page of the application.
*/
public class SignupPage {
private UserController c2w_pi_userController = new UserController(); // Controller for user-related operations
private BackgroundImageController c2w_pi_backgroundImg = new BackgroundImageController(); // Controller for background image
/**
* Creates and returns the signup scene.
* @param c2w_pi_backHandler A Runnable to handle the action
of going back to the previous scene.
* @return The signup scene.
*/
public Scene createSignupScene(Runnable c2w_pi_backHandler) {
    // Logo image
    //Code from Player's INFO as it is //
    
    ImageView c2w_pi_logo = new ImageView("images/user1.png");
    c2w_pi_logo.setFitWidth(70);
    c2w_pi_logo.setPreserveRatio(true);
    HBox hv1=new HBox(c2w_pi_logo);
    hv1.setAlignment(Pos.TOP_CENTER);
    
  Label heading = new Label("REGISTRATION");
         heading.setTextFill(Color.YELLOW);
         heading.setFont(new Font(50));
        
        
         Label name = new Label("Enter Your Name");
         name.setFont(new Font(25));
         name.setTextFill(Color.BLACK);

         TextField tx = new TextField();
         tx.setPromptText("Enter Namee");
         tx.setFont(new Font(20));
         tx.setPrefWidth(300);
         tx.setStyle("-fx-background-radius:20");

         Label dob = new Label("Enter Date Of Birth(YYYY/MM/DD)");
         dob.setFont(new Font(25));
         dob.setTextFill(Color.BLACK);
        TextField tx1 = new TextField();
         tx1.setPromptText("Enter DOB");
         tx1.setFont(new Font(20));
         tx1.setPrefWidth(300);
         tx1.setStyle("-fx-background-radius:20");

         Label mn = new Label("Enter Election Card ID");
         mn.setFont(new Font(25));
         mn.setTextFill(Color.BLACK);

         TextField tx2 = new TextField();
         tx2.setPromptText("Enter ID");
         tx2.setFont(new Font(20));
         tx2.setPrefWidth(300);
         tx2.setStyle("-fx-background-radius:20");

         Label mail = new Label("Enter Your Mail");
         mail.setFont(new Font(25));
         mail.setTextFill(Color.BLACK);
         TextField tx4 = new TextField();
         tx4.setPromptText("Enter MAIL");
         tx4.setFont(new Font(20));
         tx4.setPrefWidth(300);
         tx4.setStyle("-fx-background-radius:20");
         
         Label tx3 = new Label("Enter Password");
         tx3.setPrefWidth(300);
         tx3.setFont(new Font(25));
         tx3.setStyle("-fx-background-radius:20");
         PasswordField password = new PasswordField();
         password.setFont(new Font(25));
         password.setFocusTraversable(true);
         password.setVisible(true);
         //password.setTextFill(Color.WHITE);
         password.setStyle("-fx-min-width: 270;-fx-min-height: 30;-fx-background-radius: 20;");
        

          Label note = new Label("Please Enter Appropriate Details");
         note.setTextFill(Color.GREEN);
         note.setFont(new Font(30));
         note.setStyle("-fx-font-weight:bold");


         Label label = new Label("WELCOME TO SIGNUP PAGE");
         label.setFont(new Font(40));
         label.setTextFill(Color.BLUE);
         label.setStyle("-fx-font-weight:bold");

         HBox Hbox = new HBox(label);
         Hbox.setLayoutX(400);

         
         Button previous = new Button("Back to Login Page ");
                 previous.setTextFill(Color.BLACK);
                previous.setFont(new Font(20));
                previous.setTextFill(Color.BLACK);
                previous.setLayoutX(30);
                previous.setPrefWidth(220);
                previous.setStyle("-fx-background-color:YELLOW");
                previous.setStyle("-fx-background-radius:30");       

                previous.setOnAction(new EventHandler<ActionEvent>() {
                 
                        public void handle(ActionEvent event) {
                       // signupBackHandler.run();  
                        c2w_pi_backHandler.run();
                            }  
            });
                        
        
                Button signin = new Button("Sign-In");
                signin.setTextFill(Color.BLACK);
                signin.setFont(new Font(20));
                signin.setTextFill(Color.BLACK);
                signin.setLayoutX(30);
                signin.setPrefWidth(220);
                signin.setStyle("-fx-background-color:WHITE");
                signin.setStyle("-fx-background-radius:30");      
                signin.setOnAction(new EventHandler<ActionEvent>() {
                 
                        public void handle(ActionEvent event) {

                            
                                if (!tx.getText().isEmpty() && !tx1.getText().isEmpty()&& !tx2.getText().isEmpty() && !tx4.getText().isEmpty()&& !password.getText().isEmpty() ) {
                                
                                if (c2w_pi_userController.handleSignup(tx.getText(),tx1.getText(),tx2.getText(),tx4.getText(),password.getText())) {
                                    LoginPage c2w_pi_loginPage = new LoginPage();
                                
                                c2w_pi_loginPage.getLoginScene();
                                } else {
                              //  c2w_pi_output.setText("User not Registered");
                                System.out.println("User not Registered");
                                
                                }
                                } else {
                                //c2w_pi_output.setText("Please Enter Username and Password");
                                    System.out.println("Please Enter Username and Password");
                               }
                                signin.setStyle("-fx-background-color:AQUA");   
                       // navigateToselect();        
                    }
                });

                Button  clear = new Button("Clear");
        clear.setTextFill(Color.BLACK);
        clear.setFont(new Font(25));
        clear.setTextFill(Color.BLACK);
        clear.setLayoutX(30);
        clear.setPrefWidth(150);
        clear.setStyle("-fx-background-radius:30");

        //clear.setOnMouseEntered(event -> clear.setStyle("-fx-background-color:Green"));
        //clear.setOnMouseExited(event -> clear.setStyle("-fx-background-color:gray"));
            clear.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                tx.clear();
                tx1.clear();
                tx2.clear();
                tx4.clear();
                password.clear();
            
            }
        });            
                         
        HBox hb = new HBox(180,previous,signin);
        HBox hb1 = new HBox(clear);
        hb1.setLayoutX(890);
        hb1.setLayoutY(810);
        VBox vbf = new VBox(20,Hbox,hv1,name,tx,dob,tx1,mn,tx2,mail,tx4,tx3,password,hb,note);
        //vbf.setStyle("-fx-background-radius: 2em; "+"-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.5), 5,0,0,0);"+
        //"-fx-background-color: linear-gradient(to right, #808991, #5C6366);");

       // vbf.setStyle("-fx-background-color: black");
        //vbf.setStyle("-fx-background-color: #808080 ; -fx-max-width : 600");
        //vbf.setOpacity(0.8);

        VBox vb=new VBox(vbf);
        vb.setPadding(new Insets(525,600,500,700));
        vb.setStyle("-fx-background-image: url('blur.jpg');-fx-background-size:cover");
        //vb.setStyle("-fx-background-image: url('blur.jpg');-fx-background-size:cover");
        //vb.setStyle("-fx-background-image: url('blur.jpg');-fx-background-size:cover");
        //vb.setStyle("-fx-background-radius: 2em; "+"-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.5), 5,0,0,0);"+"-fx-background-color: linear-gradient(to right, #808991, #5C6366);");
        StackPane c2w_pi_sp = new StackPane(vb);
        //c2w_pi_sp.setStyle("-fx-background-image:url('" + c2w_pi_backgroundImg.imageData() + "');-fx-background-size:cover;");
       
        return new Scene(c2w_pi_sp, 1980, 1000);     
            }
        }
            //Code written in Navigated by Vaishnavi
            
//public void navigateToselect() {
        //     select select = new select();
        //     Scene selectScene = new Scene(select.createselectScene(this::handleBack), 1800, 900);
        //     select.setselectScene(selectScene);
        //     select.setselect(prstage);
        //     prstage.setScene(selectScene);
        //     prstage.show();
        //     }
        
        //    void handleBack() {
        //     prstage.setScene(signupScene);
        
        // }

        //  void handlelogout(){
        //      c2w_pi_primaryStage.setScene(c2w_pi_loginPage);
        //  }
        