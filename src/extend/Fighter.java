package extend;

public class Fighter extends Human{
	public Fighter(String name, int hp, int offensive) {
		super(name, hp, offensive);
		name = "戦士";
		hp = 200;
		offensive = 20;
	}
	@Override
	public void attack(Living target) {
		int a =Rand.get(10);
		System.out.println(name + "が" + "斧で攻撃！" + offensive*a +"のダメージを与えた。");
		target.hp -= offensive*a;
	}

}
