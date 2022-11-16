package extend;
public class Dragon extends Monster{
	 public Dragon(String name,int hp,int offensive) {
		super(name, hp, offensive);
		name = "勇者";
		hp = 200;
		offensive = 20;
	 }
	 @Override 
	 public void attack(Living target) {
		int a =Rand.get(10);
		System.out.println(name + "が" + "炎で攻撃！" + offensive*a +"のダメージを与えた。");
		target.hp -= offensive*a;
	 }

}
