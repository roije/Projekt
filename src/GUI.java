import javafx.application.Application;
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


    public GUI()
    {

    }

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("VikarApp");
        GridPane root = new GridPane();
        Scene scene1 = new Scene(root, 800, 800);

        TabPane tabPane = new TabPane();
        Tab tab = new Tab();
        tab.setText("new tab");
        tab.setContent(new Rectangle(200,200, Color.LIGHTSTEELBLUE));
        tabPane.getTabs().add(tab);

        root.getChildren().addAll(tabPane);
        primaryStage.setScene(scene1);
        primaryStage.show();

    }
}