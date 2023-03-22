//////////////////////////////////////////////////////////////////////////////////////////////////
//  animalsGrid
//  This class defines the objects and methods that will be handling the menu functions
//  of our animal details grid
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import teoespero.firstscreentespero.model.Animal;
import teoespero.firstscreentespero.model.DataProvider;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//////////////////////////////////////////////////////////////////////////////////////////////////
//  Class definition
public class animalsGrid implements Initializable {

    //  will contain everything in FXML
    Stage stage;

    //  FXML tags used
    Parent scene;

    //  the grid
    @FXML
    private TableView<Animal> tblViewAnimal;

    //  the ID
    @FXML
    private TableColumn<Animal, Integer> animalIDCol;

    //  the Breed
    @FXML
    private TableColumn<Animal, String> breedCol;

    //  the lifeSpan
    @FXML
    private TableColumn<Animal, Integer> lifeSpanCol;

    //  the Price
    @FXML
    private TableColumn<Animal, Double> priceCol;

    @FXML
    private Button btnDetailsAnimails;

    @FXML
    private Button btnDetailsBack;





    /////////////////////////////////////////////////////////////////////////////////
    //  onActionDisplayMainMenu - opens our animal-details.fxml form
    //  when the user clicks on the Details button
    @FXML
    void onActionDisplayAnimalDetailsMenu(ActionEvent event) throws IOException {
        //  the BACK button was clicked
        System.out.println("Details button clicked...");

        //  get event information
        //  --> find the Button that triggered the event
        //      --> find the Scene/Window
        //          --> Convert it to a Stage object
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();

        displayWindow(stage, "animal-details.fxml", "Animal Details");

    }

    /////////////////////////////////////////////////////////////////////////////////
    //  onActionDisplayMainMenu - opens our main-menu.fxml form
    //  when the user clicks on the Back button
    @FXML
    void onActionDisplayMainMenu(ActionEvent event) throws IOException {
        //  the BACK button was clicked
        System.out.println("Back button clicked...");

        //  get event information
        //  --> find the Button that triggered the event
        //      --> find the Scene/Window
        //          --> Convert it to a Stage object
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();

        displayWindow(stage, "main-menu.fxml", "Main Menu");

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

    //  this method is called everytime this Class is loaded
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("animalsGrid.java loaded...");

        //  define our table view
        tblViewAnimal.setItems(DataProvider.getAllAnimals());

        //  set up the ID Column
        System.out.println("Initializing the ID column...");
        animalIDCol.setCellValueFactory(new PropertyValueFactory<>("id"));

        //  set up the breed Column
        System.out.println("Initializing the breed column...");
        breedCol.setCellValueFactory(new PropertyValueFactory<>("breed"));

        //  set up the lifeSpan Column
        System.out.println("Initializing the lifeSpan column...");
        lifeSpanCol.setCellValueFactory(new PropertyValueFactory<>("lifeSpan"));

        //  set up the price Column
        System.out.println("Initializing the price column...");
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
    }

}
//////////////////////////////////////////////////////////////////////////////////////////////////