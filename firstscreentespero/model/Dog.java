//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Dog
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

import teoespero.firstscreentespero.model.Animal;

public class Dog extends Animal {
    private String special;

    //////////////////////////////////////////////////////////////////
    //  constructors
    public Dog() {
    }

    public Dog(int id, String breed, int lifeSpan, String behavior, double price, boolean isVaccinated, String special) {
        super(id, breed, lifeSpan, behavior, price, isVaccinated);
        this.special = special;
    }

    //////////////////////////////////////////////////////////////////
    //  getter
    public String getSpecial() {
        return special;
    }

    //////////////////////////////////////////////////////////////////
    //  setter
    public void setSpecial(String special) {
        this.special = special;
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////