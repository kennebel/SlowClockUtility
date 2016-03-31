/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slowclock;

import java.io.InputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author jcunningham
 */
public class SlowClock extends Application {
    private final Group background = new Group();
    
    @Override
    public void start(Stage primaryStage) {
        //Button btn = new Button();
        //btn.setText("Say 'Hello World'");
        //btn.setOnAction(new EventHandler<ActionEvent>() {
        //    
        //    @Override
        //    public void handle(ActionEvent event) {
        //        System.out.println("Hello World!");
        //    }
        //});
        
        StackPane root = new StackPane();
        //root.getChildren().add(btn);
        configureBackground();
        root.getChildren().add(background);
        
        Scene scene = new Scene(root, 310, 310);
        
        primaryStage.setTitle("Slow Clock Utility");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void configureBackground() {
        ImageView imageView = new ImageView();
        Image image = loadImage();
        imageView.setImage(image);

        background.getChildren().add(imageView);
    }

    public Image loadImage() {
        InputStream is = SlowClock.class.getResourceAsStream("stopwatch.png");
        return new Image(is);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
