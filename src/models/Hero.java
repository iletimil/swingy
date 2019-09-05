package models;

public abstract class Hero {

	public int attack;
	public int defense;
	public int hp;
	public int xp;
	public int lvl;
	public int x,y;
	public String name;
	public String type;
	type = new StringBuilder(String.Valueof(this.getClass())).delete(0, 12).toString();
	
	Hero(){
		
	}
	
	Hero(String name)
	{
		this.name = name;
	}
	
	public void setBase(int attack, int defense, int hp, int xp, int lvl, int x, int y) {
		setAttack(attack);
		setDefense(defense);
		setHp(hp);
		setLvl(lvl);
		setXp(xp);
		setX(x);
		setY(y);
	}
	
	public abstract String getName();
	public abstract void setName(String name);

	public abstract int getAttack();
	public abstract void setAttack(int attack);
	
	public abstract int getDefense();
	public abstract void setDefense(int defense);
	
	public abstract int getHp();
	public abstract void setHp(int hp);
	
	public abstract int getLvl();
	public abstract void setLvl(int lvl);
	
	public abstract int getXp();
	public abstract void setXp(int xp);
	
	public abstract int getX();
	public abstract void setX(int X);
	
	public abstract int getY();
	public abstract void setY(int y);
	
	public abstract String getType();
}
