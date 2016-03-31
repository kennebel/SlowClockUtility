/*
 Learning utility
 */
package slowclock;

import java.io.InputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
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
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Clock Clk = new Clock();
        root.getChildren().add(Clk);
        
        Scene scene = new Scene(root, 310, 310);
        
        primaryStage.setTitle("Slow Clock Utility");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private class Clock extends Parent {
        private final Group background = new Group();
    
        public Clock() {
            configureBackground();
            getChildren().add(background);
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
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
