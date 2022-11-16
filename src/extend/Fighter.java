package extend;

public class Fighter extends Human{
	public Fighter(String name, int hp, int offensive) {
		this.name = name;
		this.offensive = offensive;
		this.hp = hp;
	}
	@Override
	public void attack(Living target) {
		int a =Rand.get(10);
		System.out.println(name + "が" + "斧で攻撃！" + offensive*a +"のダメージを与えた。");
		target.hp -= offensive*a;
	}

}
