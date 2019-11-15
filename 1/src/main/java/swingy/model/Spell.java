package swingy.model;

import swingy.controller.StorageController;

public class Spell implements Item {
    private String name;
    private int stat;
    StorageController sc = new StorageController();

    public Spell() {
        name = "Helm";
        stat =  (int) (10 + Math.floor( (Math.random() * 70) + 1));
    }

    public String getName() {
        return name;
    }

    @Override
    public void applyItem(Hero hero) {
        hero.setHp(hero.getHp() + this.stat);
        sc.updateStats(hero);
        System.out.println("|Item found! Hero picks up -> " + name + ": +" + stat + "|");
    }
}