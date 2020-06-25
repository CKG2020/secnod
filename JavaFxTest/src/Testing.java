import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Testing extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("login/xml/login.fxml"));
        AnchorPane root=(AnchorPane)FXMLLoader.load(getClass().getResource("login/xml/login.fxml"));
        Scene scene = new Scene(root, 300, 275);
        primaryStage.setTitle("使用FXML");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}