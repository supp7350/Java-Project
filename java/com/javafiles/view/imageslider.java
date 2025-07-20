package com.javafiles.view;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class imageslider extends Application {

    private static final String[] IMAGE_URLS = {
        "image2.jpg",
        
        "image3.jpg",
        "image4.jpg",
        "image6.jpg",
        "image7.jpg"
        // "file:animation\\src\\main\\resources\\image1.jpg",
        // "file:animation\\src\\main\\resources\\Iimage2.jpg",
        // "file:animation\\src\\main\\resources\\image3.jpg",
        // "file:animation\\src\\main\\resources\\image4.jpg"
        // "file:animation\\src\\main\\resources\\mi4.jpg",
        // "file:animation\\src\\main\\resources\\mi5.jpg",
        // "file:animation\\src\\main\\resources\\mi6.jpg",
        // //"file:animation\src\main\resources\IMAO6.jpg"
    };

    private static final int NUM_OF_IMAGES = IMAGE_URLS.length;
    private static final int SLIDE_WIDTH = 600; // Width of each image
    private static final Duration SLIDE_DURATION = Duration.seconds(3);
    private static final int IMAGE_SPACING = 20; // Space between images

    @Override
    public void start(Stage primaryStage) {
        // Create a VBox to hold the HBox
        VBox outerVBox = new VBox();
        outerVBox.setPadding(new Insets(20)); // Optional: Add padding around the outer VBox
outerVBox.setBackground(new Background(new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY)));

        // Create a VBox to hold the HBox and any other elements
        VBox innerVBox = new VBox();
        innerVBox.setPadding(new Insets(10)); // Optional: Add padding around the inner VBox

        HBox imageBox = new HBox();
        imageBox.setSpacing(IMAGE_SPACING); // Set spacing between images
        imageBox.setPadding(new Insets(10)); // Optional: Add padding around the images

        // Load images into ImageViews and add them to the HBox
        for (String imageUrl : IMAGE_URLS) {
            Image image = new Image(imageUrl);
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(SLIDE_WIDTH); // Set the fit width to the slide width
            imageView.setPreserveRatio(true); // Preserve the image's aspect ratio
            imageView.setSmooth(true); // Optional: improves the quality of the scaled image
            imageView.setCache(true); // Optional: improves performance by caching the image

            // Create a circle border around the image
            StackPane stackPane = new StackPane();
            Circle circle = new Circle();
            circle.setRadius(SLIDE_WIDTH / 2); // Radius equal to half of the image width
            circle.setStroke(Color.WHITE); // Border color
            circle.setStrokeWidth(5); // Border width
            circle.setFill(Color.TRANSPARENT); // Transparent fill
            stackPane.getChildren().addAll(imageView);

            // Add the stack pane to the HBox
            imageBox.getChildren().add(stackPane);
        }

        // Add the HBox (imageBox) to the inner VBox
        innerVBox.getChildren().add(imageBox);

        // Add the inner VBox to the outer VBox
        outerVBox.getChildren().add(innerVBox);

        // ScrollPane to hold the outer VBox and enable scrolling
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(outerVBox);
        scrollPane.setFitToWidth(true); // Optional: Fit the width of the scroll pane to the content
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER); // Disable horizontal scroll bar

        // Create a TranslateTransition for sliding the images
        TranslateTransition transition = new TranslateTransition(SLIDE_DURATION, imageBox);
        transition.setByX(-SLIDE_WIDTH); // Slide left by the width of one image
        transition.setCycleCount(TranslateTransition.INDEFINITE); // Repeat indefinitely
        transition.setAutoReverse(false); // Do not slide back

        Label lb=new Label("Your vote can be the next big change");
  lb.setFont(Font.font("Arial", FontWeight.BOLD, 50));
        lb.setTextFill(javafx.scene.paint.Color.BLACK);
       VBox vBox=new VBox(scrollPane,lb);
       vBox.setAlignment(Pos.CENTER);
       vBox.setStyle("");
       vBox.setBackground(new Background(new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY)));


       
       

        // Create a scene and set it on the stage
        Scene scene = new Scene(vBox, SLIDE_WIDTH + 40, imageBox.getChildren().get(0).getBoundsInLocal().getHeight() + 100); // Adjust scene dimensions
        primaryStage.setScene(scene);
        primaryStage.setTitle("Image Slider");

        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(4), lb);
        translateTransition.setFromX(-scene.getWidth()); // start from off-screen left
        translateTransition.setToX(scene.getWidth()); // move to off-screen right
        translateTransition.setCycleCount(TranslateTransition.INDEFINITE); // repeat indefinitely

        // Start the translation animation
        translateTransition.play();

        // Show the stage
        primaryStage.show();

        // Start the animation
        transition.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}