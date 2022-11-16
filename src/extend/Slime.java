package extend;

public class Slime extends Monster{
	public Slime(String name, int hp, int offensive) {
		super(name, hp, offensive);
		name = "スライム";
		hp = 200;
		offensive = 20;
	}
	@Override
	public void attack(Living target) {
		int a =Rand.get(10);
		System.out.println(name + "が" + "体当たりで攻撃！" + offensive*a +"のダメージを与えた。");
		target.hp -= offensive*a;
	}
}
