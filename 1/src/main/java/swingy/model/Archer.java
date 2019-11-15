package swingy.model;

public class Archer extends Hero
{
    public Archer()
    {
        this.setBase(attack, defense, hp, xp, lvl, x, y);
    }
    public Archer(String name)
    {
        super(name);
        this.setBase(attack, defense, hp, xp, lvl, x, y);
    }
}