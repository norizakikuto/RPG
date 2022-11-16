package extend;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		
		
		List<Human> human =new ArrayList<>();
		human.add(new Brave ("勇者", 200, 20));
		human.add(new Fighter("戦士",200,20));
		human.add(new Wizard("魔法使い",200,20));
		
		List<Monster> monster =new ArrayList<>();
		monster.add(new Dragon("ドラゴン",200, 20));
		monster.add(new Oak("オーク",200,20));
		monster.add(new Slime("スライム",200,20));
		
		int tar;
		int att;
		Human h;
		Monster m;
		int lih;
		int lim;
		while(!human.isEmpty() || !monster.isEmpty()){
			System.out.println("人間のターン！");
			lih = human.size();
			tar = Rand.get(lih);
			h = human.get(tar);
			lim = monster.size();
			att = Rand.get(lim);
			m = monster.get(att);
			h.attack(m);
			
			if(m.hp <= 0) {
				System.out.println(m.name +"が倒れた");
				monster.remove(m);
			}
			if(monster.isEmpty()) {
				break;
			}
			
			System.out.println("モンスターのターン！");
			lim = monster.size();
			tar = Rand.get(lim);
			m = monster.get(tar);
			lih = human.size();
			att = Rand.get(lih);
			h = human.get(att);
			m.attack(h);
			
			if(h.hp <= 0) {
				System.out.println(h.name +"が倒れた");
				human.remove(h);
			}
			if(human.isEmpty()) {
				break;
			}
		
		}
		
		if(monster.isEmpty()) {
			System.out.println("勇者たちは勝利した");
		}else {
			System.out.println("勇者たちは敗北した");
		}
		
	}

}
