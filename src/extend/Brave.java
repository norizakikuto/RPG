package extend;

public class Brave extends Human{
	public Brave(String name, int hp, int offensive) {
		this.name = name;
		this.offensive = offensive;
		this.hp = hp;
	}	
	@Override
	public void attack(Living target) {
		int a =Rand.get(10);
		System.out.println(name + "が" + "剣で攻撃！" + offensive*a +"のダメージを与えた。");
		target.hp -= offensive*a;
	}
		
		
	
	

}
