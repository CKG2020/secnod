package com.easyArch.client.ui.controller;

import com.easyArch.client.entry.User;
import com.easyArch.client.ui.ControllerStage;
import com.easyArch.client.ui.UiController;
import com.easyArch.client.ui.container.IdContainer;
import com.easyArch.client.ui.container.ResourceContainer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable, ControllerStage {

    @FXML
    private ImageView close;
    @FXML
    private ImageView min;
    @FXML
    private ImageView shineImage;
    @FXML
    private Accordion friends;
    @FXML
    private ScrollPane friendSp;
    @FXML
    private Label username;
    @FXML
    private Label signature;
    private User user=new User();
    @Override
    public Stage getStage() {
        UiController uiController = UiController.getInstance();
        return uiController.getStageByName(IdContainer.MainView);
    }

    @Override
    public  Boolean setStage() {
        return null;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        username.textProperty().bind(user.userNameProperty());
    }
    @FXML
    private void close(){

//        FriendManager.getInstance().onFriendLogout(Long.parseLong(username.getText()));
        System.exit(0);
    }
    @FXML
    private void closeEntered(){
        Image image= ResourceContainer.getClose_1();
        close.setImage(image);
        System.out.println("==========================");
        System.out.println(username.getText());


    }
    @FXML
    private void bind() {
        friendSp.setFitToWidth(false);
        friends.expandedPaneProperty().addListener((arg0, arg1, arg2) -> {
            if (arg2 != null) {
                System.out.println("-------11111111--------");
            }
            if (arg1 != null) {
                System.out.println("-------2222222222---------");
            }
        });
    }

    @FXML
    private void closeExited(){
        Image image=ResourceContainer.getClose();
        close.setImage(image);
    }

    @FXML
    private void minEntered(){
        Image image=ResourceContainer.getMin_1();
        min.setImage(image);
//        FriendManager.getInstance().onFriendLogout();

    }
    @FXML
    private void minExited(){
        Image image=ResourceContainer.getMin();
        min.setImage(image);
    }

    @FXML
    private void min(){
        getStage().setIconified(true);
    }

    @FXML
    private void username_entered() {
        username.setStyle("-fx-background-radius:4;-fx-background-color: #136f9b");
    }

    @FXML
    private void username_exited() {
        username.setStyle("");
    }

    @FXML
    private void autograph_entered() {
        signature.setStyle("-fx-background-radius:4;-fx-background-color: #136f9b");
    }

    @FXML
    private void autograph_exited() {
        signature.setStyle("");
    }


    @FXML
    private void headEx() {
        shineImage.setVisible(false);
    }

    @FXML
    private void headEn() {
        shineImage.setVisible(true);
    }
//
//    @FXML
//    private void queryEvent() {
//        SearchManager.getInstance().refreshRecommendFriends(new ArrayList<>());
//    }





}
