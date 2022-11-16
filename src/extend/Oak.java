package extend;

public class Oak extends Monster{
	public Oak(String name, int hp, int offensive) {
		super(name, hp, offensive);
		name = "オーク";
		hp = 200;
		offensive = 20;
	}
	@Override
	public void attack(Living target) {
		int a =Rand.get(10);
		System.out.println(name + "が" + "で攻撃！" + offensive*a +"のダメージを与えた。");
		target.hp -= offensive*a;
	}
}
