package com.javafiles.view;


import java.io.File;
import com.sun.prism.paint.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class Document {

    private Scene DocumentScene;
    private Stage prstage;
    private Image backgroundImage;

    public void setDocument(Stage prstage){
        this.prstage = prstage;
    }
    public void setDocumentScene(Scene DocumentScene){
        this.DocumentScene = DocumentScene;
    } 

    public Pane createDocumentScene(Runnable DocumentBackHandler) { 
    
    Label label = new Label();
    label.setText("UPLOAD DOCUMENTS");
    label.setFont(new Font(50));
    label.setLayoutX(1200);
    label.setLayoutY(200);
    //label.setTextFill(Color.RED);
    label.setStyle("-fx-text-fill:white;");
    


    Label t1 = new Label(" Insert Adhar-Card Copy");
    t1.setFont(new Font(30));
    t1.setStyle("-fx-background-radius:18"); 
    t1.setStyle("-fx-background-color: white;" + "-fx-font-color:WHITE; ");

       ImageView addharView = new ImageView();
     
       Button baddhar=new Button("Upload Aadhar-Card  ");
      baddhar.setStyle("-Fx-Background-Color: yellow" );
    //   baddhar.setOnAction(new EventHandler<ActionEvent>() {
    //     public void handle(ActionEvent event){
    //       baddhar.setStyle("-fx-background-color: GREY;" + "-fx-text-fill: RED; ");
    //           System.out.println("User uploading Aadhar-Card");
    // }
    //     });
    FileChooser pgFileChooser = new FileChooser();
        pgFileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg" ,"*.jpeg"));

        // Set up the button action
        baddhar.setOnAction(event -> {
        baddhar.setStyle("-fx-background-color: GREY;" + "-fx-text-fill: RED; ");
         System.out.println("User uploading Aadhar-Card");
         File selectedFile = pgFileChooser.showOpenDialog(null);
            if (selectedFile != null) {
                String imageUrl = ImageUploader.uploadImage(selectedFile.getPath(),selectedFile.getName());
                if (imageUrl != null) {
                    System.out.println(imageUrl);
                    Image image = new Image(imageUrl);
                    addharView.setImage(image);
                }
            }
        });
        
    baddhar.setStyle("-fx-background-color: YELLOW;" + "-fx-text-fill: RED; ");
    baddhar.setScaleX(5);
    baddhar.setScaleY(8);
   // baddhar.setLayoutX(150);
    baddhar.setPrefHeight(5);
    baddhar.setFont(new Font(4));
 
    HBox hbaddhar=new HBox(baddhar);
    hbaddhar.setAlignment(Pos.CENTER);
   Label t2 = new Label("Insert Election-Card Copy");
   t2.setStyle("-fx-background-color: white;" + "-fx-font-color:WHITE; ");
    t2.setFont(new Font(30));
    
   // t2.setStyle("-fx-font-weight:bold");
    
    //t2.setStyle("-fx-font-weight:bold");
    
    ImageView elecView = new ImageView();
    Button belec=new Button(" Upload Election-Card  ");
      belec.setStyle("-Fx-Background-Color: aqua" );
       //belec.setTextFill(Color.yellow);
        FileChooser pgFileChooserr = new FileChooser();
        pgFileChooserr.getExtensionFilters().addAll(
         new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg" ,"*.jpeg"));

        // Set up the button action
        belec.setOnAction(event -> {
          belec.setStyle("-fx-background-color: GREY;" + "-fx-text-fill: RED; ");
          System.out.println("User uploading Election-Card");
            File selectedFile = pgFileChooserr.showOpenDialog(null);
            if (selectedFile != null) {
                String imageUrl = ImageUploader.uploadImage(selectedFile.getPath(),
                        selectedFile.getName());
                if (imageUrl != null) {
                    System.out.println(imageUrl);
                    Image image = new Image(imageUrl);
                  elecView.setImage(image);
                }
            }
        });
        belec.setStyle("-fx-background-color: YELLOW;" + "-fx-text-fill: RED; ");
        belec.setScaleX(5);
        belec.setScaleY(8);
       // belec.setLayoutX(100);
        belec.setPrefHeight(5);
        belec.setFont(new Font(4));
        HBox hbelec=new HBox(belec);
        hbelec.setAlignment(Pos.CENTER);

        Button previous = new Button("previous");
        previous.setFont(new Font(30));
        previous.setLayoutX(30);
        previous.setPrefWidth(170);
        previous.setOnMouseEntered(event -> previous.setStyle("-fx-background-color:Orange"));
        previous.setOnMouseExited(event -> previous.setStyle("-fx-background-color:green"));
        previous.setStyle("-fx-background-color:ORANGE");
        previous.setStyle("-fx-background-radius:25");
        previous.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent event) {
                previous.setStyle("-fx-background-color:GREEN");
                DocumentBackHandler.run();
                prstage.show();
            }
        });

        Label time =new Label("Enter the time to vote");
         ComboBox<String> comboBox3 = new ComboBox<>();

        // Add items to the ComboBox
        comboBox3.getItems().addAll(
       "10: 00 AM to 11:45 AM",
       "12:00 PM to 2.00 PM",
       "2:00 PM to 3:30 PM"
        );

        // Optional: Set a default value
        comboBox3.setValue("CHHOSE SUITABLE TIME");

        // create button next
        Button next = new Button("Next");
        next.setFont(new Font(30));
        next.setLayoutX(30);
        next.setPrefWidth(150);
        next.setOnMouseEntered(event -> next.setStyle("-fx-background-color:Orange"));
        next.setOnMouseExited(event -> next.setStyle("-fx-background-color:green"));
        next.setStyle("-fx-background-color:WHITE");
        next.setStyle("-fx-background-radius:25");
        next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                next.setStyle("-fx-background-color:green");
                navigateTotiming();
            
     } });
     HBox hb = new HBox(60,previous,next);
        
VBox vbF=new VBox(70, t1,hbaddhar,t2,hbelec,comboBox3,hb);
vbF.setStyle("-fx-background-color: rgba(0,0,0,0.5) ; -fx-max-width : 500");
VBox vb=new VBox(vbF);
vb.setPadding(new Insets(300, 500, 800, 1300));
//vb.setStyle("-fx-background-color: rgba(0,0,0,0.5) ; -fx-max-width : 500");
  //                              "-fx-background-color: linear-gradient(to right, #00FFFF, #5C6366);");
    
                              //  vb.setStyle("-fx-background-image: url('Assets\\images\\document.jpg')");


vb.backgroundProperty();

       // vb.setStyle("-fx-background-image: url('DocUPLOAD.jpg'); -fx-background-size : cover");
      // Load the image
       /* Image backgroundImage = new Image("images/india1.jpg");
        BackgroundImage bgImage = new BackgroundImage( backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
        BackgroundSize.DEFAULT  );
       */
        //     BackgroundRepeat.NO_REPEAT,
        //     BackgroundRepeat.NO_REPEAT,
        //     BackgroundPosition.CENTER,
        //     BackgroundSize.DEFAULT
        // );
        Pane gb = new Pane(label,vb);
         gb.setStyle("-fx-background-image: url('document.png');-fx-background-size:cover");

        return gb;
    }
        public void navigateTotiming() {
            timing timing = new timing();
            Scene timingScene = new Scene(timing.createtimingScene(this::handleBack), 1980, 990);
            timing.settimingScene(timingScene);
            timing.settiming(prstage);
            prstage.setScene(timingScene);
            prstage.show();
            }
        
            void handleBack() {
            prstage.setScene(DocumentScene);
          
        }
        }
  


