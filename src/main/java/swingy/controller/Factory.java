package swingy.controller;

import swingy.model.Archer;
import swingy.model.Hero;
import swingy.model.Hunter;
import swingy.model.SpellCaster;
import swingy.model.Item;

class Factory {
    Hero newHero(String heroClass, String name) {

        if (heroClass.equalsIgnoreCase("hunter")) {
            return new Hunter(name);
        } else if (heroClass.equalsIgnoreCase("archer")) {
            return new Archer(name);
        } else if (heroClass.equalsIgnoreCase("spellcaster")) {
            return new SpellCaster(name);
        }
        return null;
    }

    Item newItem() {
        ItemController ic = new ItemController();
        Item item;
        item = ic.dropItem();
        return item;
    }
}