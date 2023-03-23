//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Animal
//  Abstract super class that will be inherited by other classes
//  03 20 2023
//
//  Teo Espero
//  BS Software Development
//  BS Cloud and Systems Administration
//  Western Governors University
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package teoespero.firstscreentespero.model;

public abstract class Animal {

    //  data fields

    private int id;
    private String breed;
    private int lifeSpan;
    private String behavior;
    private double price;
    private boolean isVaccinated;

    //////////////////////////////////////////////////////////////////
    //  constructors
    public Animal() {
    }

    public Animal(int id, String breed, int lifeSpan, String behavior, double price, boolean isVaccinated) {
        this.id = id;
        this.breed = breed;
        this.lifeSpan = lifeSpan;
        this.behavior = behavior;
        this.price = price;
        this.isVaccinated = isVaccinated;
    }

    //////////////////////////////////////////////////////////////////
    //  getters
    public int getId() {
        return id;
    }

    public String getBreed() {
        return breed;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public String getBehavior() {
        return behavior;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    //////////////////////////////////////////////////////////////////
    //  setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////