package extend;

public class Wizard extends Human{
	public Wizard(String name, int hp, int offensive) {
		super(name, hp, offensive);
		name = "魔法使い";
		hp = 200;
		offensive = 20;
	}
	@Override
	public void attack(Living target) {
		int a =Rand.get(10);
		System.out.println(name + "が" + "魔法で攻撃！" + offensive*a +"のダメージを与えた。");
		target.hp -= offensive*a;
	}

}
