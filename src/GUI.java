import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by christianhasselstrom on 16/11/2015.
 */
public class GUI extends Application {

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("VikarApp");
        Group root = new Group();
        Scene scene1 = new Scene(root, 800, 800);

        primaryStage.setScene(scene1);
        primaryStage.show();

    }
}
