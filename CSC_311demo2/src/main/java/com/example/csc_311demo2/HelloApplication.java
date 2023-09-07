package com.example.csc_311demo2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    int x = 255;
    @Override
    public void start(Stage stage) throws IOException {
        Text hello= new Text(200,100, "Hello World!");
        Text question = new Text(170,200,"How is the weather today?");
        Text answer = new Text(200,300,"It is very hot!");
        Rectangle rect = new Rectangle(20,20,300,40);
        rect.setFill(Color.YELLOW);
        rect.setStroke(Color.BLACK);
        Circle circ = new Circle(100,150,40);
        circ.setFill(Color.DARKGRAY);

        Button btn = new Button("Wow!");
        btn.setOnAction(actionEvent -> {
            if (x > 0)
            rect.setFill(Color.rgb(x,0,0));
            x = - 50;
        });
        btn.setLayoutX(215);
        btn.setLayoutY(325);


        Group root = new Group(hello,question,answer,btn,rect,circ);

        Scene sn = new Scene(root,500,600, Color.CYAN);

        stage.setTitle("My first GUI demo");
        stage.setScene(sn);

        stage.show();

    }

    public static void main(String[] args) {

        launch();
    }
}