package Controller;
import Model.UserDatabase;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utilitys.Logger;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class LoginPageController implements Initializable {

    @FXML private TextField userNameTextField;
    @FXML private PasswordField passwordTextField;
    @FXML private Button logInButton;

    private String alertTitle;
    private String alertHeader;
    private String alertContext;

    @FXML
    private void onLogInButtonClicked() throws IOException {
        String username = userNameTextField.getText();
        String password = passwordTextField.getText();
        //taken from spurzack
        boolean validUser = UserDatabase.login(username, password);
        if(validUser){
            // Launch Main Screen
            Logger.log(username, true);

            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/View/view-appointment.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(alertTitle);
            alert.setHeaderText(alertHeader);
            alert.setContentText(alertContext);
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle rb) {
        Locale locale = Locale.getDefault();
        rb = ResourceBundle.getBundle("resources/Languages", locale);
        userNameTextField.setText(rb.getString("Username"));
        passwordTextField.setText(rb.getString("Password"));
        logInButton.setText(rb.getString("login"));
        alertTitle = rb.getString("alertTitle");
        alertHeader = rb.getString("alertHeader");
        alertContext = rb.getString("alertContext");

    }
    //end from spurzack
}
