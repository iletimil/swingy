package swingy.model;

public class SpellCaster extends Hero
{
    public SpellCaster()
    {
        this.setBase(attack, defense, hp, xp, lvl, x, y);
    }
    public SpellCaster(String name)
    {
        super(name);
        this.setBase(attack, defense, hp, xp, lvl, x, y);
    }
}