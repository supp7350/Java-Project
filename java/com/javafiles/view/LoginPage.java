package com.javafiles.view;

import com.javafiles.controller.BackgroundImageController;

import com.javafiles.controller.UserController;
import com.javafiles.model.UserDetail;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
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
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * This class represents the login page of the application.
 */
public class LoginPage extends Application {
    private Stage c2w_pi_primaryStage; // The primary stage for displaying scenes
    private Scene c2w_pi_loginScene; // Scene for the login page
    private Scene c2w_pi_userScene, c2w_pi_adminScene; // Scenes for the user and admin dashboards
    private UserController c2w_pi_userController = new UserController(); // Controller for user-related operations
    private BackgroundImageController c2w_pi_backgroundImg = new BackgroundImageController(); // Controller for
    // background image
    public static String c2w_pi_key; // Static key to store the logged-in username
    // Method to initialize the login page

    public void getLoginPage(Stage c2w_pi_primaryStage) {
        this.c2w_pi_primaryStage = c2w_pi_primaryStage;
        initLoginScene(); // Initialize the login scene
    }

    // Method to initialize the login scene
    private void initLoginScene() {
        // Logo image
        ImageView c2w_pi_logo = new ImageView("images/user1.png");
        c2w_pi_logo.setFitWidth(80);
        c2w_pi_logo.setPreserveRatio(true);
        c2w_pi_logo.setLayoutX(150);
        HBox hb1logo = new HBox(c2w_pi_logo);
        hb1logo.setAlignment(Pos.TOP_CENTER);

        /*
         * prstage.setTitle("voting");
         * prstage.setWidth(1800);
         * prstage.setHeight(900);
         * prstage.setResizable(true);
         */
        HBox hb1tick = new HBox();
        Label heading = new Label("WELCOME TO LOGIN PAGE");
        heading.setTextFill(Color.PURPLE);
        heading.setFont(new Font(40));

        Label lb = new Label("Enter Your Name");
        lb.setFont(new Font(30));
        lb.setTextFill(Color.BLACK);

        TextField user_tx = new TextField();
        user_tx.setPromptText("Enter Name");
        user_tx.setFont(new Font(20));
        user_tx.setPrefWidth(500);
        user_tx.setStyle("-fx-background-radius:20");

        Label lb2 = new Label("Enter Your PassWord");
        lb2.setFont(new Font(30));
        lb2.setTextFill(Color.BLACK);

        Label note = new Label("NOTE-Havent you Register??");
        note.setFont(new Font(30));
        note.setTextFill(Color.RED);

        PasswordField tx1 = new PasswordField();
        tx1.setPromptText("Enter PassWord");
        tx1.setPrefWidth(500);
        tx1.setFont(new Font(20));
        tx1.setStyle("-fx-background-radius:20");


        Image c2w_pi_hide = new Image("images/hide.jpg"); // Image for hide icon

        Image c2w_pi_show = new Image("images/show.jpg"); // Image for show icon
        ImageView c2w_pi_icon = new ImageView(c2w_pi_show); // ImageView for toggle icon
        c2w_pi_icon.setFitWidth(30);
        c2w_pi_icon.setPreserveRatio(true);

        HBox c2w_pi_passBox = new HBox(10, tx1); // HBox for password fields

        c2w_pi_passBox.setPrefWidth(400);
        HBox c2w_pi_iconBox = new HBox(10, c2w_pi_icon); // HBox for toggle icon

        c2w_pi_iconBox.setMaxWidth(70);
        c2w_pi_iconBox.setAlignment(Pos.BASELINE_LEFT);
        StackPane c2w_pi_passFieldStackPane = new StackPane(c2w_pi_passBox, c2w_pi_iconBox); // StackPane for password
                                                                                             // field and icon
        c2w_pi_passFieldStackPane.setAlignment(Pos.BASELINE_RIGHT);
        TextField c2w_pi_textFieldPassword = new TextField();
        c2w_pi_textFieldPassword.setPromptText("Enter Password");
        c2w_pi_textFieldPassword.setFocusTraversable(false);
        c2w_pi_textFieldPassword.setVisible(false);
        c2w_pi_textFieldPassword.setStyle("-fx-min-width: 270; -fx-min-height: 30; -fx-background-radius: 15;");
        c2w_pi_textFieldPassword.textProperty().bindBidirectional(tx1.textProperty());
        // Images for toggle icon

        // create button next
        c2w_pi_icon.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent c2w_pi_event) {
                if (tx1.isVisible()) {
                    tx1.setVisible(false);
                    c2w_pi_textFieldPassword.setVisible(true);
                    c2w_pi_passBox.getChildren().remove(0);
                    c2w_pi_passBox.getChildren().add(0, c2w_pi_textFieldPassword);

                    c2w_pi_icon.setImage(c2w_pi_hide);
                } else {
                    tx1.setVisible(true);
                    c2w_pi_textFieldPassword.setVisible(false);
                    c2w_pi_passBox.getChildren().remove(0);
                    c2w_pi_passBox.getChildren().add(0, tx1);
                    c2w_pi_icon.setImage(c2w_pi_show);
                }
            }
        });

        Button Login = new Button("LogIn");
        Login.setFont(new Font(25));
Login.setPrefWidth(150);
Login.setTextFill(Color.BLACK);
         Login.setOnMouseEntered(event -> Login.setStyle("-fx-background-color:Green"));
        Login.setOnMouseExited(event -> Login.setStyle("-fx-background-color:gray"));
        //Login.setStyle(
          //      "-fx-pref-width:140;-fx-min-height: 60;-fx-background-radius: 15;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");

        /*
         * Login.setFont(new Font(2));
         Login.setTextFill(Color.BLACK);
         * //Login.setLayoutX(60);
         * Login.setPrefWidth(200);
         * Login.setPrefHeight(200);
         * Login.setStyle("-fx-background-radius:30");
         * Login.setOnMouseEntered(event ->
         * Login.setStyle("-fx-background-color:Orange"));
         * Login.setOnMouseExited(event -> Login.setStyle("-fx-background-color:gray"));
         * Login.setStyle("-fx-background-color:WHITE");
         */
        Login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Login.setStyle("-fx-background-color:GREY");

                Login.setPrefSize(140, 60);
                System.out.println("IN LOGIN BUTTON");
                if (!user_tx.getText().isEmpty() && !tx1.getText().isEmpty()) {

                    if (c2w_pi_userController.authenticateUser(user_tx.getText(), tx1.getText())) {

                        System.out.print("IN SECOND IF of Login Auth...");
                        ImageView tick = new ImageView("images/GIFtickmark.gif");
                        tick.setFitWidth(80);
                        tick.setPreserveRatio(true);
                        tick.setLayoutX(150);
                        HBox hb1tick = new HBox(tick);
                        hb1tick.setAlignment(Pos.TOP_CENTER);

                        navigateToselect();

                        UserDetail c2w_pi_userDetail = c2w_pi_userController.getUserDetail(user_tx.getText());

                        // } else {
                        // // c2w_pi_output.setText("Invalid Username or Password"); // Show error
                        // message
                        // System.out.println("Invalid Username or Password");
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

                // navigateToselect();

            }
        });
        // button sign
        Button sign = new Button("Sign up");
        sign.setTextFill(Color.BLACK);
        sign.setLayoutX(30);
        sign.setPrefWidth(150);
        sign.setPrefHeight(90);
        // sign.setStyle("-fx-background-color:WHITE");
        sign.setOnMouseEntered(event -> sign.setStyle("-fx-background-color:green"));
        sign.setOnMouseExited(event -> sign.setStyle("-fx-background-color:white"));
        sign.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 17));
        sign.setUnderline(true);
        sign.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showSignupScene(); // Show signup scene
                user_tx.clear(); // Clear username field

                tx1.clear(); // Clear passwordfield

                System.out.println("User clicked on SignUPButton");

            }
        });

        Button clear = new Button("clear");
        clear.setTextFill(Color.BLACK);
        clear.setFont(new Font(25));
        clear.setTextFill(Color.BLACK);
        clear.setLayoutX(30);
        clear.setPrefWidth(150);
        clear.setOnMouseEntered(event -> clear.setStyle("-fx-background-color:Green"));
        clear.setOnMouseExited(event -> clear.setStyle("-fx-background-color:gray"));
        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                user_tx.clear();
                tx1.clear();
                // settxValue(null);
            }
        });

        // hbox for buttons previous anf next
        HBox hb = new HBox(220, clear, Login);
        // hb.setLayoutX(990);
        // hb.setLayoutY(800);

        HBox hb1 = new HBox(note, sign, hb1tick);
        // hb1.setLayoutX(700);
        // hb1.setLayoutY(650);

        VBox vb3 = new VBox(hb);
        vb3.setPadding(new Insets(500, 200, 200, 600));

        VBox vbf = new VBox(30, hb1logo, heading, lb, user_tx, lb2, c2w_pi_passBox, hb, hb1);

        vbf.setStyle("-fx-background-color: #FFFFFF; -fx-max-width : 600");
        // vbf.setOpacity(0.8);
        // vbf.setPrefSize(600,700);
        VBox vb = new VBox(vbf);
        vb.setAlignment(Pos.CENTER_RIGHT);
        vb.setPadding(new Insets(500, 400, 500, 1000));
        // vb.setStyle("-fx-background-color: ORANGE");
        // vb.setLayoutY(100);
        // vb.setPadding(new Insets(500, 500, 500, 700));
        // vb.setStyle("-fx-background-color: BLACK");
        //vb.setPadding(new Insets(000, 300, 0, 00));

        /*
         * Scene scene = new Scene(gb, 450, 100);
         * 
         * scene.setFill(new ImagePattern(new Image("Assets/images/india1.jpg")));
         * scene.setCursor(Cursor.OPEN_HAND);
         * prstage.setScene(scene);
         * loginScene = scene;
         * this.prstage = prstage;
         * this.prstage.show();
         */
        StackPane c2w_pi_sp = new StackPane(vb);
        // c2w_pi_sp.setStyle("-fx-background-image:url('" +
        // c2w_pi_backgroundImg.imageData() + "');-fx-background-size:cover;");
        // c2w_pi_sp.setStyle(new ImagePattern(new Image("Assets/images/india1.jpg")));
        c2w_pi_sp.setStyle("-fx-background-image: url('images/india1.jpg');-fx-background-size:cover");
        // c2w_pi_sp.setStyle("-fx-background-color: BLACK");
        c2w_pi_loginScene = new Scene(c2w_pi_sp, 1980, 1000);
    }
    // Code from Navigation by Vaishnavi M.

    /*
     * public void navigateTosignup() {
     * SignupPage signup = new SignupPage();
     * signupScene = new Scene(signup.createsignupScene(this::handleBack), 1800,
     * 900);
     * signup.setSignupScene(signupScene);
     * signup.setsignup(prstage);
     * c2w_pi_primaryStage.setScene(signupScene);
     * c2w_pi_primaryStage.show();
     * }
     */
    // public void navigateToselect() {
    // select select = new select();
    // selectScene = new Scene(select.createselectScene(this::handleBack), 1800,
    // 900);
    // select.setselectScene(selectScene);
    // select.setselect(prstage);
    // prstage.setScene(selectScene);
    // prstage.show();
    // }

    public void navigateToselect() {
        select select = new select();
        Scene selectScene = new Scene(select.createselectScene(this::handleBack), 1980, 990);
        select.setselectScene(selectScene);
        select.setselect(c2w_pi_primaryStage);
        c2w_pi_primaryStage.setScene(selectScene);
        c2w_pi_primaryStage.show();
    }

    // void handleBack() {
    // c2w_pi_primaryStage.setScene(loginScene);

    // }

    // Method to initialize the user scene
    private void initUserScene() {
        // UserPage c2w_pi_userPage = new UserPage(); // Create UserPage instance

        // c2w_pi_userPage.setUserPage(c2w_pi_primaryStage);

        // c2w_pi_userScene = new
        // Scene(c2w_pi_userPage.createUserScene(this::handleLogout), 1000,
        // 800); // Create user scene

        // c2w_pi_userPage.setUserPageScene(c2w_pi_userScene);
        System.out.println("INITIALING USERSCENE Scene");
    }

    // Method to initialize the admin scene
    private void initAdminScene() {
        /*
         * CategoriesPage c2w_pi_adminPage = new CategoriesPage();
         * 
         * // Create CategoriesPage instance
         * 
         * c2w_pi_adminPage.setCategoryPage(c2w_pi_primaryStage);
         * c2w_pi_adminScene = new
         * Scene(c2w_pi_adminPage.createCategoryScene(this::handleLogout), 1000, 800);
         * // Create
         * // admin
         * // scene
         * 
         * c2w_pi_adminPage.setCategoryScene(c2w_pi_adminScene);
         * 
         */
        System.out.println("IN INITILIASIATION ADMIN SCENE ");
    }

    // Method to get the login scene
    public Scene getLoginScene() {
        return c2w_pi_loginScene;
    }

    // Method to show the login scene
    public void showLoginScene() {
        c2w_pi_primaryStage.setScene(c2w_pi_loginScene);
        c2w_pi_primaryStage.show();
    }

    // Method to show the signup scene
    private void showSignupScene() {
        SignupPage signupPage = new SignupPage(); // Create SignupPage instance

        Scene signupScene = signupPage.createSignupScene(this::handleBack); // Create signup scene

        c2w_pi_primaryStage.setScene(signupScene);
        c2w_pi_primaryStage.show();

    }

    // Method to handle logout action
    private void handleLogout() {
        c2w_pi_primaryStage.setScene(c2w_pi_loginScene); // Show login scene
    }

    // Method to handle back action from signup
    private void handleBack() {
        c2w_pi_primaryStage.setScene(c2w_pi_loginScene); // Show login scene
    }

    @Override
    public void start(Stage c2w_pi_primaryStage) throws Exception {
        // Class.forName("com.example.configuration.FirebaseInitialization");
        Class.forName("com.javafiles.configuration.FirebaseInitialization");
        // Initialize Firebase

        LoginPage loginController = new LoginPage(); // Create LoginPage instance

        loginController.getLoginPage(c2w_pi_primaryStage); // Initialize login page
        c2w_pi_primaryStage.setScene(loginController.getLoginScene());// Set the initial scene to the login scene

        c2w_pi_primaryStage.setTitle("Login Page"); // Set the title of the primary stage window
        // c2w_pi_primaryStage.getIcons().add(new Image("images/c2w.png")); // Set the
        // icon of the primary stage window

        c2w_pi_primaryStage.show(); // Show the primary stage window
    }
}
