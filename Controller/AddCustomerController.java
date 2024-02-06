package Controller;

import Model.UserDatabase;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import utilitys.Helpers;

import java.util.Optional;

public class AddCustomerController {

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

    /*needs work in userdatabase to work
    @FXML
    private void OnSaveCustomerButtonClicked() {
        try {
            String addName = NameTextField.getText();
            String addAddress = AddressTextField.getText();
            String addPostalCode = PostalCodeTextField.getText();
            String addState = StateComboBox.getSelectionModel().getSelectedItem();
            String addCountry = CountryComboBox.getSelectionModel().getSelectedItem();
            String addPhoneNumber = PhoneNumberTextField.getText();

            if (Helpers.validCustomer(addName, addAddress, addPostalCode, addState, addCountry, addPhoneNumber)) {
                UserDatabase.addCustomer(addName, addAddress, addPostalCode, addState, addCountry, addPhoneNumber);
                Stage stage = (Stage) SaveCustomerButton.getScene().getWindow();
                stage.close();
            }


        }catch(Exception e) {
            e.printStackTrace();
        }

    }*/

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
