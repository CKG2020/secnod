package com.easyArch.client.util;


import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

public class Main5 extends Application{

    @Override
    public void start(Stage stage) throws Exception {

        //创建Hyperlink类
        Hyperlink hyperlink = new Hyperlink();
        hyperlink.setText("百度一下，你就知道了");


        Group group = new Group();
        group.getChildren().add(hyperlink);

        Scene scene = new Scene(group);

        stage.setScene(scene);
        stage.setHeight(500);
        stage.setWidth(500);
        stage.setTitle("hyperlink练习");
        stage.show();

        hyperlink.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                HostServices host = getHostServices();

                host.showDocument("www.baidu.com");

            }
        });
    }

    public static void main(String[] args) {

        launch(args);
    }

}

