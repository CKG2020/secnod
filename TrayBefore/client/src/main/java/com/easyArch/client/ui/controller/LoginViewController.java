package com.easyArch.client.ui.controller;

import com.easeArch.common.entry.User;
import com.easeArch.common.enums.StatusCode;
import com.easeArch.common.handler.Handler;
import com.easyArch.client.handler.HandlerFactory;
import com.easyArch.client.manager.FriendManager;
import com.easyArch.client.ui.ControllerStage;
import com.easyArch.client.ui.UiController;
import com.easyArch.client.ui.container.IdContainer;
import com.easyArch.client.ui.container.ResourceContainer;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class LoginViewController implements Initializable, ControllerStage {
    @FXML
    private Button login1;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private CheckBox rememberPsw;
    @FXML
    private CheckBox autoLogin;
    @FXML
    private ImageView closeBtn;
    @FXML
    private ImageView minBtn;
    @FXML
    private ProgressBar loginProgress;

    @FXML
    private Pane errorPane;
    @FXML
    private Label errorTips;

    //    private UiController uiController;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        login1.disableProperty().bind(
                Bindings.createBooleanBinding(() ->
                                username.getText().length() == 0 ||
                                        0 == password.getText().length(),
                        username.textProperty(), password.textProperty()));

    }

    @Override
    public Stage getStage() {
        UiController uiController = UiController.getInstance();
        return uiController.getStageByName(IdContainer.LoginView);
    }

    @Override
    public Boolean setStage() {
        UiController uiController = UiController.getInstance();
        boolean b = uiController.switchStage(IdContainer.MainView, IdContainer.LoginView);
        return b;
    }



    @FXML
    public void login() {
        final    String name = username.getText();
        final String text = password.getText();
        if (!"".equals(name) || !"".equals(text)) {
            User user = new User();
            user.setUsername(name);
            user.setPassword(text);
            System.out.println("==============");
            System.out.println(user.getUsername());

            System.out.println(user.getPassword());
            System.out.println("===============");
            HandlerFactory factory = HandlerFactory.getFactory();
            Handler login = factory.handler("login");
            Object handler = login.handler(user);


            if ("1".equals(handler)){

//                getStage().close();
                System.out.println("xxxxxxxxxxxx");

//                setStage();
                UiController.getInstance().switchStage(IdContainer.MainView, IdContainer.LoginView);
                System.out.println("yyyyyyyyyyy");
                System.out.println(user.getUsername());
                System.out.println("------------------------");
                FriendManager.getInstance().onFriendLogin(Long.parseLong(user.getUsername()));
                loginProgress.setVisible(true);
                login1.setVisible(false);
//                new Thread(()-> SwingUtilities.invokeLater(Tray::createGUI)).start();
            }
            else{
                errorPane.setVisible(true);
                errorTips.setText(StatusCode.macth((String) handler));
            }

        }

    }

    @FXML
    public void login_en() {
        login1.setStyle("-fx-background-radius:4;-fx-background-color: #097299");
    }

    @FXML
    public void login_ex() {
        login1.setStyle("-fx-background-radius:4;-fx-background-color: #2d50bb");
    }

    @FXML
    public void close() {
        System.exit(0);
    }

    public void min() {
        Stage stage = getStage();
        if (null != stage) {
            stage.setIconified(true);
        }
    }

    @FXML
    public void closeEntered() {
        Image image = ResourceContainer.getClose_1();
        closeBtn.setImage(image);

//        FriendManager.getInstance().onFriendLogin(Long.parseLong(user.getUsername()));

    }

    @FXML
    public void closeExited() {
        Image image = ResourceContainer.getClose();
        closeBtn.setImage(image);
    }

    @FXML
    public void minEntered() {
        Image image = ResourceContainer.getMin_1();
        minBtn.setImage(image);
    }

    @FXML
    public void minExited() {
        Image image = ResourceContainer.getMin();
        minBtn.setImage(image);
    }

    @FXML
    public void backToLogin() {
        loginProgress.setVisible(false);
        errorPane.setVisible(false);
        login1.setVisible(true);
    }

    @FXML
    public void gotoRegister() {
        UiController uiController = UiController.getInstance();
        uiController.switchStage(IdContainer.RegisterView, IdContainer.LoginView);
    }
}
