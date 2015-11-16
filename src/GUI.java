import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by christianhasselstrom on 16/11/2015.
 */
public class GUI extends Application {

    GridPane root;
    Stage window;

    public void GUI()
    {
        //Gridpane
        root = new GridPane();
        root.setStyle("-fx-background-color: linear-gradient(#42C0FB, #236B8E) ");
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(15));

        //Create scene
        Scene scene = new Scene(root, 1280, 700);
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        GUI();
    }

    public void logIn()
    {
        GUI();
    }

    public void seller()
    {
        GUI();
        System.out.print("");
    }
}