package com.ckg.deliverData;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.net.URL;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) {
        Parent root;
        try
        {


//            root = FXMLLoader.load(getClass().getResource("com/ckg/deliverData/ResultPage.fxml"));
//            Scene scene = new Scene(root);
//            primaryStage.setTitle("控制器间数据传递");
//            primaryStage.setScene(scene);
//            primaryStage.show();


//            FXMLLoader fxmlLoader = new FXMLLoader();
//            fxmlLoader.setController(this);
////            fxmlLoader.setLocation();
//             root = fxmlLoader.load(getClass().getResource("com.ckg/ResultPage.fxml"));


            URL url = Thread.currentThread().getContextClassLoader().getResource("com.ckg/ResultPage.fxml");
            FXMLLoader loader = new FXMLLoader(url);
            root=loader.load();


            Scene scene = new Scene(root);
            primaryStage.setTitle("控制器间数据传递");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

