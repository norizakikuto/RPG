package extend;

public class Slime extends Monster{
	public Slime(String name, int hp, int offensive) {
		this.name = name;
		this.offensive = offensive;
		this.hp = hp;
	}
	@Override
	public void attack(Living target) {
		int a =Rand.get(10);
		System.out.println(name + "が" + "体当たりで攻撃！" + offensive*a +"のダメージを与えた。");
		target.hp -= offensive*a;
	}
}
