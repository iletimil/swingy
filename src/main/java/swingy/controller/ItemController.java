package swingy.controller;

import java.util.Random;

import swingy.model.Armor;
import swingy.model.Item;
import swingy.model.Spell;
import swingy.model.Weapon;

class ItemController {
    private String itemType;
    private Item item;

    ItemController() {
        Random rand = new Random();
        int randomItemIndex = rand.nextInt(11);
        String[] itemTypes = {"Weapon", "Armor", "Spell", "Armor", "Spell", "Weapon", "Spell", "Weapon", "Armor", "Armor", "Spell", "Weapon"};
        itemType = itemTypes[randomItemIndex];
    }

    Item dropItem() {
        if (itemType.equalsIgnoreCase("weapon")) {
            item = new Weapon();
        } else if (itemType.equalsIgnoreCase("armor")) {
            item = new Armor();
        } else if (itemType.equalsIgnoreCase("spell")) {
            item = new Spell();
        }
        return item;
    }
}