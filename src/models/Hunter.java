package models;

public class Hunter extends Hero{

	public Hunter() {
		this.setBase(27, 14, 90, 0, 0, 0, 0);
	}
	
	public Hunter(String name) {
		super(name);
		this.setBase(27, 14, 90, 0, 0, 0, 0);
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAttack()
	{
		return this.attack;
	}
	
	public void setAttack(int attack)
	{
		this.attack = attack;
	}
	
	public int getDefense()
	{
		return this.defense;
	}
	
	public void setDefense(int defense)
	{
		this.defense = defense;
	}
	
	public int getHp()
	{
		return this.hp;
	}
	
	public void setHp(int hp)
	{
		this.hp = hp;
	}
	
	public int getLvl()
	{
		return this.lvl;
	}
	
	public void setLvl(int lvl)
	{
		this.lvl = lvl;
	}
	
	public int getXp()
	{
		return this.xp;
	}
	
	public void setXp(int xp)
	{
		this.xp = xp;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public String getType()
	{
		return this.type;
	}
}
