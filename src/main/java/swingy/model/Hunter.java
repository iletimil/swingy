package swingy.model;

public class Hunter extends Hero
{
    public Hunter()
    {
        this.setBase(attack, defense, hp, xp, lvl, x, y);
    }
    public Hunter(String name)
    {
        super(name);
        this.setBase(attack, defense, hp, xp, lvl, x, y);
    }
}