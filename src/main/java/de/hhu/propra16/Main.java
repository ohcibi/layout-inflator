package de.hhu.propra16;

import de.hhu.propra16.xml.LayoutInflator;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Tobias Witt on 28.06.16.
 */
public class Main extends Application {
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        LayoutInflator layoutInflator = new LayoutInflator();

        Parent root = layoutInflator.inflate(getClass().getResource("/layout" +
                ".xml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
