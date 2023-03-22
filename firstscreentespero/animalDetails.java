//////////////////////////////////////////////////////////////////////////////////////////////////
//  animalDetails
//  This class defines the objects and methods that will be handling the menu functions
//  of our animal details screen
//  03 21 2023
//
//  Teo Espero
//  BS Software Development
//  BS Cloud and System Administration
//  Western Governors University
//
//////////////////////////////////////////////////////////////////////////////////////////////////

//  we define where our code resides
package teoespero.firstscreentespero;

//  we declare the imports that we will be needing
//  for our JavaFX application
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//////////////////////////////////////////////////////////////////////////////////////////////////
//  Class definition
public class animalDetails implements Initializable {
    //  will contain everything in FXML
    Stage stage;

    Parent scene;
    //  FXML tags used
    @FXML
    private Button btnBackAnimalDetails;

    @FXML
    private Label lblBehavior;

    @FXML
    private Label lblBreed;

    @FXML
    private Label lblID;

    @FXML
    private Label lblLifeSpan;

    @FXML
    private Label lblPrice;

    @FXML
    private Label lblVaccinated;

    /////////////////////////////////////////////////////////////////////////////////
    //  onActionDisplayMainMenu - opens our animalsGrid.fxml form
    //  when the user clicks on the BACK button
    @FXML
    void onActionDisplayMainMenu(ActionEvent event) throws IOException {
        //  the Animal Details button was clicked
        System.out.println("BACK button clicked...");

        //  get event information
        //  --> find the Button that triggered the event
        //      --> find the Scene/Window
        //          --> Convert it to a Stage object
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();

        displayWindow(stage, "animalsGrid.fxml", "Animals Listing");

    }

    ///////////////////////////////////////////////////////////////////////////////////////
    //  method for displaying the window
    private void displayWindow(Stage stage, String windowName, String windowTitle) throws IOException {
        //  show the Stage object it originated from
        System.out.println(stage);

        //  load the create-animal.fxml screen
        scene = FXMLLoader.load(getClass().getResource(windowName));

        stage.setTitle(windowTitle);

        //  set the new scene to our stage
        stage.setScene(new Scene(scene));

        //  display the new window
        stage.show();
        System.out.println(windowName + " loaded...");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("animalDetails.java loaded...");
    }

}
//////////////////////////////////////////////////////////////////////////////////////////////////