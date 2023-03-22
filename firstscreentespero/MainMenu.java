//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  MainMenu
//  This is our main class...
//  03 20 2023
//  Sample JavaFX Application
//
//  Teo Espero
//  BS Software Development
//  BS Cloud and Systems Administration
//  Western Governors University
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  we define where our code resides
package teoespero.firstscreentespero;

//  we declare the imports that we will be needing
//  for our JavaFX application
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import teoespero.firstscreentespero.model.DataProvider;
import teoespero.firstscreentespero.model.Dog;

import java.io.IOException;

//////////////////////////////////////////////////////////////////////////////////////////////////
//  Class definition
public class MainMenu extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //  load our main menu screen
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenu.class.getResource("main-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 200);
        stage.setTitle("Menu Options");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        Dog dog01 = new Dog(1, "Siberian Huskie", 15, "Crafty", 599.99, true, "Whistles");
        Dog dog02 = new Dog(2, "Corgi", 25, "Friendly", 2000.00, true, "Homely");
        Dog dog03 = new Dog(3, "German Shepherd", 30, "Loyal", 1500.00, true, "Smart");
        Dog dog04 = new Dog(4, "Dalmatian", 27, "Cuddly", 1000.00, true, "Smart");
        Dog dog05 = new Dog(5, "Dachshund", 27, "Playful", 1200.50, true, "Does tricks");
        Dog dog06 = new Dog(6, "Mastiff", 14, "Dependable", 5000.00, true, "Intelligent");

        DataProvider.addAnimal(dog01);
        DataProvider.addAnimal(dog02);
        DataProvider.addAnimal(dog03);
        DataProvider.addAnimal(dog04);
        DataProvider.addAnimal(dog05);
        DataProvider.addAnimal(dog06);
        launch();
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////