//////////////////////////////////////////////////////////////////////////////////////////////////
//  MenuController
//  This class defines the objects and methods that will be handling the menu functions
//  of our Animal application
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
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//////////////////////////////////////////////////////////////////////////////////////////////////
//  Class definition
public class MenuController implements Initializable {

    //  will contain everything in FXML
    Stage stage;
    Parent scene;

    //  our FXML tags
    @FXML
    private Button btnCreateMenu;

    @FXML
    private Button btnDisplayMenu;

    @FXML
    private Button btnExitMenu;

    /////////////////////////////////////////////////////////////////////////////////
    //  onActionCreateAnimal - opens our create-animal.fxml form
    //  when the user clicks on the CREATE button on the main menu screen
    @FXML
    void onActionCreateAnimal(ActionEvent event) throws IOException {

        //  the CREATE button was clicked
        System.out.println("Create button clicked...");

        //  get event information
        //  --> find the Button that triggered the event
        //      --> find the Scene/Window
        //          --> Convert it to a Stage object
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();

        displayWindow(stage, "create-animal.fxml", "Create Animal");
    }

    /////////////////////////////////////////////////////////////////////////////////
    //  onActionDisplayAnimals - opens our animalsGrid.fxml form
    //  when the user clicks on the DISPLAY button on the main menu screen
        @FXML
    void onActionDisplayAnimals(ActionEvent event) throws IOException {
        //  the CREATE button was clicked
        System.out.println("Display button clicked...");

        //  get event information
        //  --> find the Button that triggered the event
        //      --> find the Scene/Window
        //          --> Convert it to a Stage object
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();

        displayWindow(stage, "animalsGrid.fxml", "Animals Listing");
    }

    /////////////////////////////////////////////////////////////////////////////////
    //  onActionExit - shuts down our application when the user clicks on EXIT
    @FXML
    void onActionExit(ActionEvent event) throws IOException {
        //  the EXIT button was clicked
        System.out.println("Exit button clicked...");

        //  get event information
        //  --> find the Button that triggered the event
        //      --> find the Scene/Window
        //          --> Convert it to a Stage object
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();

        //  close the window
        stage.close();
        System.out.println("Shutting down the app...");

        //  exit the app
        System.exit(0);
    }

    /////////////////////////////////////////////////////////////////////////////////
    //  displayWindow - method for displaying the main window
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
        System.out.println("App is now running...");
    }


}
//////////////////////////////////////////////////////////////////////////////////////////////////