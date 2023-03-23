//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  DataProvider
//  Subclass that inherits methods and data from the Animal class
//  03 20 2023
//
//  Teo Espero
//  BS Software Development
//  BS Cloud and Systems Administration
//  Western Governors University
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package teoespero.firstscreentespero.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import teoespero.firstscreentespero.model.Animal;


public class DataProvider {
    private static ObservableList<Animal> allAnimals = FXCollections.observableArrayList();

    public static void addAnimal(Animal animal){
        System.out.println(animal.getBreed() + " data added...");
        allAnimals.add(animal);
    }

    public static ObservableList<Animal> getAllAnimals(){
        System.out.println("Data loaded to observable list...");
        return allAnimals;
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////