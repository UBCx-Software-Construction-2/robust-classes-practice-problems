package model;

import model.exceptions.NoCookException;
import model.exceptions.NoIngredientException;
import model.exceptions.NotEnoughMoneyException;

public class Owner {

    private String name;
    private Kitchen kitchen;

    public Owner(String name, Kitchen kit) {
        this.name = name;
        kitchen = kit;
    }

    //getters
    public String getName() {
        return name;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    // REQUIRES: we have enough ingredients to make the specified amount of tacos
    // MODIFIES: this
    // EFFECTS: calls makeTaco on the kitchen, returns true
    public boolean orderMoreTacos(int amount) throws NoIngredientException, NoCookException {
        try {
            kitchen.makeTaco(amount);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    //MODIFIES: this 
    //EFFECTS: calls buyIngredients on the kitchen, returns true.
    public boolean askForMoreIngredients(int amount) throws NotEnoughMoneyException {
        try {
            this.kitchen.buyIngredients(amount);
        } catch (NotEnoughMoneyException e) {
            return false;
        }
        return true;
    }


}
