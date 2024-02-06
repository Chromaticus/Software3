package utilitys;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Map;
import java.util.Optional;

public class Helpers {
    private static String error;

    public static void showAlert(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }


/*This code defines two maps, one that maps contact names to their corresponding IDs,
and another that maps contact IDs to their corresponding names.
The getContactId method takes a contactName as input and returns the corresponding ID from the nameToIdMap.
If the contactName is not found in the map,
it throws an IllegalArgumentException with an error message indicating that the contact name was not found.
The getContactName method takes a contactId as input and returns the corresponding name from the idToNameMap.
If the contactId is not found in the map,
it throws an IllegalArgumentException with an error message indicating that the contact ID was not found.*/

    private Map<String, Integer> nameToIdMap;
    private Map<Integer, String> idToNameMap;


    public int getContactId(String contactName) throws IllegalArgumentException {
        Integer contactId = nameToIdMap.get(contactName);
        if (contactId == null) {
            throw new IllegalArgumentException("Contact name not found: " + contactName);
        }
        return contactId;
    }

    public String getContactName(int contactId) throws IllegalArgumentException {
        String contactName = idToNameMap.get(contactId);
        if (contactName == null) {
            throw new IllegalArgumentException("Contact ID not found: " + contactId);
        }
        return contactName;
    }




    public static Boolean validCustomer(String addName, String addAddress, String addPostalCode,String addState,String addCountry, String addPhoneNumber){
        error = "";
        if(!validName(addName) || !validAddress(addAddress) || !validPostalCode(addPostalCode) || !validState(addState) || !validCountry(addCountry) || !validPhoneNumber(addPhoneNumber)){
            System.out.println(error);
            Helpers.showAlert("Error", "Please fix the following error:", error);
            return Boolean.FALSE;
        }
        else {
            return Boolean.TRUE;
        }
    }

    private static boolean validName(String addName) {
        if(addName.isEmpty()) {
            error = "Please enter a Name";
            return Boolean.FALSE;
        }
        else{
            return Boolean.TRUE;
        }
    }

    private static boolean validAddress(String addAddress) {
        if(addAddress.isEmpty()) {
            error = "Please enter a Address";
            return Boolean.FALSE;
        }
        else{
            return Boolean.TRUE;
        }
    }

    private static boolean validPostalCode(String addPostalCode) {
        if(addPostalCode.isEmpty()) {
            error = "Please enter a Postal Code";
            return Boolean.FALSE;
        }
        else{
            return Boolean.TRUE;
        }
    }

    private static boolean validState(String addState) {
        if(addState.isEmpty()) {
            error = "Please enter a State/Provenance";
            return Boolean.FALSE;
        }
        else{
            return Boolean.TRUE;
        }
    }

    private static boolean validCountry(String addCountry) {
        if(addCountry.isEmpty()) {
            error = "Please enter a Country";
            return Boolean.FALSE;
        }
        else{
            return Boolean.TRUE;
        }
    }

    private static boolean validPhoneNumber(String addPhoneNumber) {
        if(addPhoneNumber.isEmpty()) {
            error = "Please enter a Phone Number";
            return Boolean.FALSE;
        }
        else{
            return Boolean.TRUE;
        }
    }



}