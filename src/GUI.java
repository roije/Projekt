import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * Created by christianhasselstrom on 16/11/2015.
 */
public class GUI extends Application {

    GridPane root;
    Stage window;
    ToggleGroup tGroup;
    ToggleButton myProfileBtn, sellersBtn, buyersBtn, matchesBtn, tasksBtn,  signOutBtn;;
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
        homeScreen();
    }

    public void logIn()
    {
        GUI();
    }

    public void homeScreen()
    {
        GUI();
        //Label
        Label headLine = new Label("Vicarius");
        Reflection r = new Reflection();
        r.setFraction(0.7f);
        headLine.setEffect(r);
        headLine.setTextFill(Color.GHOSTWHITE);
        headLine.setFont(Font.font("Verdana", FontWeight.BOLD, 40));
        root.getChildren().add(headLine);
        root.setConstraints(headLine, 1, 1, 4, 1);

        //sellersBtn
        sellersBtn = new ToggleButton("Sellers");
        root.setConstraints(sellersBtn,1,6);
        sellersBtn.setPrefHeight(20);
        sellersBtn.setPrefWidth(100);
        sellersBtn.setFont(Font.font("Verdana"));
        sellersBtn.setStyle("-fx-background-color: linear-gradient(#fafdfe, #a7d9f5)");
        root.getChildren().add(sellersBtn);


        //buyersBtn
        buyersBtn = new ToggleButton("Buyers");
        root.setConstraints(buyersBtn,2,6);
        buyersBtn.setPrefHeight(20);
        buyersBtn.setPrefWidth(100);
        buyersBtn.setFont(Font.font("Verdana"));
        buyersBtn.setStyle("-fx-background-color: linear-gradient(#fafdfe, #a7d9f5)");
        root.getChildren().add(buyersBtn);

        //matchesBtn
        matchesBtn = new ToggleButton("Matches");
        root.setConstraints(matchesBtn, 3, 6);
        matchesBtn.setPrefHeight(20);
        matchesBtn.setPrefWidth(100);
        matchesBtn.setFont(Font.font("Verdana"));
        matchesBtn.setStyle("-fx-background-color: linear-gradient(#fafdfe, #a7d9f5)");
        root.getChildren().add(matchesBtn);

        //taskBtn
        tasksBtn = new ToggleButton("Tasks");
        root.setConstraints(tasksBtn, 4, 6);
        tasksBtn.setPrefHeight(20);
        tasksBtn.setPrefWidth(100);
        tasksBtn.setFont(Font.font("Verdana"));
        tasksBtn.setStyle("-fx-background-color: linear-gradient(#fafdfe, #a7d9f5)");
        root.getChildren().add(tasksBtn);

        //myProfileBtn
        myProfileBtn = new ToggleButton("My Profile");
        root.setConstraints(myProfileBtn, 5, 6);
        myProfileBtn.setPrefHeight(20);
        myProfileBtn.setPrefWidth(100);
        myProfileBtn.setFont(Font.font("Verdana"));
        myProfileBtn.setToggleGroup(tGroup);
        myProfileBtn.setStyle("-fx-background-color: linear-gradient(#fafdfe, #a7d9f5)");
        root.getChildren().add( myProfileBtn);


        //signOutBtn
        signOutBtn = new ToggleButton("Sign Out");
        VBox signOutVBox = new VBox();
        signOutVBox.getChildren().add(signOutBtn);

        root.getChildren().add(signOutVBox);
        root.setConstraints(signOutVBox, 67, 56);
    }

    public void myProfile()
    {
        homeScreen();
        myProfileBtn.setStyle("-fx-background-color: green");
        Label text = new Label("dsjihsf");
        root.getChildren().add(text);
        root.setConstraints(text,15,15);
    }

    public void task()
    {
        homeScreen();
        tasksBtn.setStyle("-fx-background-color: green");

    }
}