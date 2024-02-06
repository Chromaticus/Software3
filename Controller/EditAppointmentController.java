package Controller;

import Model.Appointments;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Optional;

public class EditAppointmentController {

    // Inject UI elements from the FXML file using @FXML annotation
    @FXML
    private AnchorPane addAppointmentAnchorPane;
    @FXML
    private Label addAppointmentLabel;
    @FXML
    private TextField appointmentIDTextField;
    @FXML
    private TextField titleTextField;
    @FXML
    private TextField descriptionTextField;
    @FXML
    private TextField locationTextField;
    @FXML
    private ComboBox<String> contactComboBox;
    @FXML
    private TextField typeTextField;
    @FXML
    private DatePicker startDate;
    @FXML
    private DatePicker endDate;
    @FXML
    private TextField customerIDTextField;
    @FXML
    private TextField userIDTextField;
    @FXML
    private Button saveButton;
    @FXML
    private Button cancelButton;

    // Initialize the controller class and set up the UI
    public void initialize() {
        // TODO: Set up the Contact combo box with values from the database
        // TODO: Set up the Start Date and End Date pickers to only allow valid dates
        // TODO: Set up the Save and Cancel buttons with event handlers
    }

    // Handle the event when the Contact combo box is clicked
    public void OnContactComboBoxClicked() {
        // TODO: Get the selected Contact and display their information
    }

    // Save the new appointment to the database when the Save button is clicked
    @FXML
    public void onSaveButtonClicked() {
        // TODO: Get the values from the UI elements and validate them
        // TODO: Create a new appointment object with the validated values
        // TODO: Save the appointment to the database
        // TODO: Close the Add Appointment window
    }

    // Close the Add Appointment window when the Cancel button is clicked
    @FXML
    public void onCancelButtonClicked() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Alert");
        alert.setContentText("Are you sure you want cancel changes and return to the main screen?");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            // Get the stage and close it
            Stage stage = (Stage) cancelButton.getScene().getWindow();
            stage.close();
        }
    }

    // Helper method to validate the appointment data
    private boolean validateAppointmentData() {
        // TODO: Implement validation for the appointment data
        return true;
    }

    // Helper method to create a new appointment object with the validated data
    private Appointments createAppointment() {
        // TODO: Create a new appointment object with the validated data
        return null;
    }

}

