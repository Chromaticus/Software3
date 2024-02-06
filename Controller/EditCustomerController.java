package Controller;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Optional;

public class EditCustomerController {

    @FXML
    private TextField CustomerIDTextField;

    @FXML
    private TextField NameTextField;

    @FXML
    private TextField AddressTextField;

    @FXML
    private TextField PostalCodeTextField;

    @FXML
    private ComboBox<String> StateComboBox;

    @FXML
    private ComboBox<String> CountryComboBox;

    @FXML
    private TextField PhoneNumberTextField;

    @FXML
    private Button SaveCustomerButton;

    @FXML
    private Button CancelCustomerButton;

    @FXML
    private void OnStateComboBoxClicked() {
        // code for handling state selection
    }

    @FXML
    private void OnCountryCombBoxClicked() {
        // code for handling country selection
    }

    @FXML
    private void OnSaveCustomerButtonClicked() {
        // code for handling customer save button click
    }

    @FXML
    private void OnCancelCustomerButtonClicked() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Alert");
        alert.setContentText("Are you sure you want cancel changes and return to the main screen?");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            // Get the stage and close it
            Stage stage = (Stage) CancelCustomerButton.getScene().getWindow();
            stage.close();
        }
    }
}

