//////////////////////////////////////////////////////////////////////////////////////////////////
//  createAnimal
//  This class defines the objects and methods that will be handling the menu functions
//  of our Create Animal Screen
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import teoespero.firstscreentespero.model.DataProvider;
import teoespero.firstscreentespero.model.Dog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//////////////////////////////////////////////////////////////////////////////////////////////////
//  Class definition
public class createAnimal implements Initializable {

    //  will contain everything in FXML
    Stage stage;

    Parent scene;

    //  FXML tags used
    @FXML
    private Button btnCreateAnimalBack;

    @FXML
    private Button btnCreateAnimalSave;

    @FXML
    private RadioButton rdbtnVaccinatedNo;

    @FXML
    private RadioButton rdbtnVaccinatedYes;

    @FXML
    private TextField txtAnimalID;

    @FXML
    private TextField txtBehavior;

    @FXML
    private TextField txtBreed;

    @FXML
    private TextField txtLifespan;

    @FXML
    private TextField txtPrice;

    /////////////////////////////////////////////////////////////////////////////////
    //  onActionDisplayMainMenu - opens our main-menu.fxml form
    //  when the user clicks on the BACK button
    @FXML
    void onActionDisplayMainMenu(ActionEvent event) throws IOException {
        //  the BACK button was clicked
        System.out.println("BACK button clicked...");

        //  get event information
        //  --> find the Button that triggered the event
        //      --> find the Scene/Window
        //          --> Convert it to a Stage object
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();

        displayWindow(stage, "main-menu.fxml", "Main Menu");

    }

    @FXML
    void onActionSaveAnimalActionEvent(ActionEvent event) {

        //  local vars to capture the field data from the form
        int id = Integer.parseInt(txtAnimalID.getText());
        String behavior = txtBehavior.getText();
        String breed = txtBreed.getText();
        int lifeSpan = Integer.parseInt(txtLifespan.getText());
        double price = Double.parseDouble(txtPrice.getText());
        boolean isVaccinated;
        String special = "";

        if (rdbtnVaccinatedYes.isSelected()){
            isVaccinated = true;
        }else{
            isVaccinated = false;
        }


        Dog newDog = new Dog(id, breed, lifeSpan, behavior, price, isVaccinated, special);
        DataProvider.addAnimal(newDog);
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
        System.out.println("createAnimal.java loaded...");
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////