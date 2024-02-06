package Controller;

import Model.Appointments;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ReportPageController {

    @FXML
    private TableView AppointmentByTypeTable;

    @FXML
    private TableView AppointmentByMonthTable;

    @FXML
    private TableView AppointmentByContactTable;

    @FXML
    private TableView OtherReportTable;

    @FXML
    private Label AppointmentsByTypeLabel;

    @FXML
    private Label AppointmentsByMonthLabel;

    @FXML
    private Label AppointmentsByContactLabel;

    @FXML
    private Label OtherReportLabel;

    @FXML
    private ComboBox AppointmentByTypeComboBox;

    @FXML
    private ComboBox AppointmentByMonthComboBox;

    @FXML
    private ComboBox AppointmentByContactComboBox;

    @FXML
    private Button ReturnToOverviewButton;

    @FXML
    private void OnAppointmentByTypeComboBoxClicked() {
        // TODO: Add event handler code
    }

    @FXML
    private void OnAppointmentByMonthComboBoxClicked() {
        // TODO: Add event handler code
    }

    @FXML
    private void OnAppointmentByContactComboBoxClicked() {
        // TODO: Add event handler code
    }

    @FXML
    private void OnReturnToOverviewButtonClicked() {
        // TODO: Add event handler code
    }

    // Table columns
    @FXML
    private TableColumn<Appointments, String> appointmentIDColumn;
    @FXML
    private TableColumn<Appointments, String> titleColumn;
    @FXML
    private TableColumn<Appointments, String> descriptionColumn;
    @FXML
    private TableColumn<Appointments, String> locationColumn;
    @FXML
    private TableColumn<Appointments, String> contactColumn;
    @FXML
    private TableColumn<Appointments, String> typeColumn;
    @FXML
    private TableColumn<Appointments, String> startDateTimeColumn;
    @FXML
    private TableColumn<Appointments, String> endDateTimeColumn;
    @FXML
    private TableColumn<Appointments, String> customerIDColumn;
    @FXML
    private TableColumn<Appointments, String> userIDColumn;

    public void initialize() {
        // TODO: Add initialization code
    }

}
