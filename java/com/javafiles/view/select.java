
//First Page



package com.javafiles.view;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class select {
        private Stage stage;
        private Scene scene;
        private Stage prstage;
        private Scene selectScene;
        private Scene DocumentScene;
        
     
    public void setselect(Stage prstage){
        this.prstage = prstage;
    }

    public void setselectScene(Scene selectScene){
        this.selectScene = selectScene;
    }
    public Pane createselectScene(Runnable selectBackHandler) {
    
        Label lb1 = new Label();
        lb1.setText("Select Your District");
        lb1.setFont(new Font(40));
        lb1.setTextFill(Color.BLACK);
        lb1.setStyle("-fx-font-weight:bold");
        ComboBox<String> comboBoxDist = new ComboBox<>();

       // Add items to the ComboBox
        comboBoxDist.getItems().addAll(
            "Pune",
            "SATARA ",
            "JALGAON ",
            " THANE",
            "KOLHAPUR",
            "JALGAON",
            "NASHIK",
            "MUMBAI"
        );

        // Optional: Set a default value
        comboBoxDist.setValue("SELECT DISTRICT FROM LIST");

        // Create a StackPane
        /*StackPane stackPane = new StackPane();
stackPane.setPrefSize(100, 050);
        // Add the ComboBox to the StackPane
        stackPane.getChildren().add(comboBox);
         // Set the scene on the stage
        // primaryStage.setScene(scene);
        HBox hbDist=new HBox(stackPane);


*/      TextField tx = new TextField();
         tx.setPromptText("select District");
         tx.setFont(new Font(40));
         tx.setStyle("-fx-background-radius:20");
         tx.setPrefWidth(500);
        Label lb2 = new Label();
        lb2.setText("Select sub- District");
        lb2.setFont(new Font(30));
        lb2.setTextFill(Color.BLACK);
        lb2.setStyle("-fx-font-weight:bold");

        ComboBox<String> comboBox2 = new ComboBox<>();

        // Add items to the ComboBox
        comboBox2.getItems().addAll(
            "Pune-INDAPUR",
            "Pune-BHOR",
            "PUNE-PURANDHAR",
            "PUNE-AMBEGAON",
            "PUNE-MULSHI",
            "SATARA-KHANDALA ",
            "SATARA-WAI",
            "SATARA-PHALTAN",
            "SATARA-MAHABLESHWAR",
            "JALGAON-BHUSAWAL ",
            " THANE-BHIWANDI",
            "KOLHAPUR-HATKANANGLE",
            "JALGAON",
            "NASHIK",
            "MUMBAI",
            "JALGAON-AMALNER"
        );

        // Optional: Set a default value
        comboBox2.setValue("SELECT SUB-DISTRICT FROM LIST");

        // Create a StackPane
        /*StackPane stackPaneSUBDIST = new StackPane();
        stackPaneSUBDIST.setPrefSize(100, 050);
        // Add the ComboBox to the StackPane
        stackPaneSUBDIST.getChildren().add(comboBox);
               
        HBox hbsubDist=new HBox(stackPaneSUBDIST);
        hbsubDist.setAlignment(Pos.CENTER);

*/
        //TextField tx1 = new TextField();
        // tx1.setPromptText("select Your Sub-District");
        // tx1.setFont(new Font(20));
        // tx1.setStyle("-fx-background-radius:20");
        // tx1.setPrefWidth(500);
        Label lb3 = new Label();
        lb3.setText("choose Nearst Verification Center");
        lb3.setFont(new Font(40));
        lb3.setTextFill(Color.BLACK);
        lb3.setStyle("-fx-font-weight:bold");
        
        TextField tx3 = new TextField();
        tx3.setPromptText("select Verification Center");
        tx3.setFont(new Font(40));
        tx3.setStyle("-fx-background-radius:20");
        tx3.setPrefWidth(500);
        ComboBox<String> comboBox3 = new ComboBox<>();

        // Add items to the ComboBox
        comboBox3.getItems().addAll(
            "Pune-INDAPUR",
            "Pune-BHOR",
            "PUNE-PURANDHAR",
            "PUNE-AMBEGAON",
            "PUNE-MULSHI",
            "SATARA-KHANDALA ",
            "SATARA-WAI",
            "SATARA-PHALTAN",
            "SATARA-MAHABLESHWAR",
            "JALGAON-BHUSAWAL ",
            " THANE-BHIWANDI",
            "KOLHAPUR-HATKANANGLE",
            "JALGAON",
            "NASHIK",
            "MUMBAI"
        );

        // Optional: Set a default value
        comboBox3.setValue("CHHOSE NEAREST VERIFICATION CENTER FROM LIST");

        // Create a StackPane
       /* StackPane stackPaneloc = new StackPane();
        stackPaneloc.setPrefSize(100, 050);
        // Add the ComboBox to the StackPane
        stackPaneloc.getChildren().add(comboBox);
        */
        /*
        HBox hbLOC=new HBox(comboBox3);
        hbLOC.setAlignment(Pos.CENTER);
        hbLOC.setPrefSize(70,15 );
        */
        Button previous = new Button("Previous");
        previous.setTextFill(Color.BLACK);
        previous.setFont(new Font(30));
        previous.setTextFill(Color.BLACK);
        previous.setLayoutX(30);
        previous.setPrefWidth(170);
        previous.setStyle("-fx-background-color:WHITE");
        previous.setOnMouseEntered(event -> previous.setStyle("-fx-background-color:Green"));
        previous.setOnMouseExited(event -> previous.setStyle("-fx-background-color:aqua"));
        previous.setStyle("-fx-background-radius:20");
        previous.setOnAction(new EventHandler<ActionEvent>() {
         
                 public void handle(ActionEvent event) {
                
                 previous.setStyle("-fx-background-color:GREEN"); 
                 selectBackHandler.run();
                 prstage.show();           
            }
        });
            
        Button next = new Button("Next");
        next.setTextFill(Color.BLACK);
        next.setFont(new Font(30));
        next.setTextFill(Color.BLACK);
        next.setLayoutX(30);
        next.setPrefWidth(170);
        next.setStyle("-fx-background-color:Green");
        next.setOnMouseEntered(event -> next.setStyle("-fx-background-color:Green"));
        next.setOnMouseExited(event -> next.setStyle("-fx-background-color:aqua"));
        next.setStyle("-fx-background-radius:20");       
        next.setOnAction(new EventHandler<ActionEvent>() {
         
                public void handle(ActionEvent event){
                 next.setStyle("-fx-background-color:GREEN");   
                   navigateToDocument(); 
                   prstage.show();       
            }
        });
        
        // Button logout = new Button("LogO");
        // logout.setTextFill(Color.BLACK);
        //  logout.setFont(new Font(20));
        //  logout.setTextFill(Color.BLACK);
        //  logout.setLayoutX(30);
        //  logout.setStyle("-fx-background-color:WHITE"); 
        //  logout.setStyle("-fx-background-radius:2em");
        //  logout.setShape(new javafx.scene.shape.Circle(600));
    
        //  logout.setOnAction(new EventHandler<ActionEvent>() {
         
        //      private Scene signupScene;

        //    public void handle(ActionEvent event) {
        //             logout.setStyle("-fx-background-color:GREEN");   
        //             selectBackHandler.run(); 
        //             prstage.setScene(signupScene);
        //             prstage.show();       
        //    }
        //  });
        //VBox vb1 = new VBox(logout);
        //vb1.setPadding(new Insets(10, 5, 1150, 1600));

        HBox hb = new HBox(150,previous,next);

        VBox vb1 = new VBox(30,lb1,comboBoxDist,lb2,comboBox2,lb3,comboBox3,hb);
        // vb1.setStyle("-fx-background-color: white");
        // vb1.setOpacity(0.8);
        //vb1.setPadding(new Insets(300,600,400,750));


        VBox vb=new VBox(vb1);
        vb.setPadding(new Insets(200,600,550,200));

       Pane gb = new Pane(vb);
        gb.setStyle("-fx-background-image: url('images/world.jpg');-fx-background-size:cover");

        return gb;
    }
       public void navigateToDocument() {
        Document Document = new Document();
        Scene DocumentScene = new Scene(Document.createDocumentScene(this::handleBack), 1980, 1200);
        Document.setDocumentScene(selectScene);
        Document.setDocument(prstage);
        prstage.setScene(DocumentScene);
        prstage.show();
        }
    
       void handleBack() {
        prstage.setScene(selectScene);
       }
         //scene.setFill(new ImagePattern(new Image("Assets//vote.jpg") );     
        }
    




