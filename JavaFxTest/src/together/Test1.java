package together;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

public class Test1 {
    @FXML
    private Text hintText;
    @FXML
    private PasswordField passwordField;

    @FXML
    protected void showPasswordButton(ActionEvent event) {
        hintText.setText("显示密码:" + passwordField.getText());
    }
}
