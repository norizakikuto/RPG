package extend;
import java.util.ArrayList;
import java.util.List;


public class main {
	public static void main(String[] args) {
		
		List<Human> human =new ArrayList<>();
		human.add(new Brave ("勇者", 200, 20));
		human.add(new Fighter("戦士",200,20));
		human.add(new Wizard("魔法使い",200,20));
		
		List<Monster> monster =new ArrayList<>();
		monster.add(new Dragon("ドラゴン",200, 20));
		monster.add(new Oak("オーク",200,20));
		monster.add(new Slime("スライム",200,20));
		
		while(!human.isEmpty() || !monster.isEmpty()){
			System.out.println("人間のターン！");
			int tar =Rand.get(3);
			Human h =human.get(tar);
			int att = Rand.get(3);
			Monster m =monster.get(att);
			h.attack(m);
			
			if(m.hp <= 0) {
				monster.remove(m);
				System.out.println(m.name +"が倒れた");
			}
			
			System.out.println("モンスターのターン！");
			tar =Rand.get(3);
			m =monster.get(tar);
			att = Rand.get(3);
			h =human.get(att);
			m.attack(h);
			
			if(h.hp <= 0) {
				human.remove(h);
				System.out.println(h.name +"が倒れた");
			}
			
		
		}
		
		if(human.isEmpty()) {
			System.out.println("勇者たちは勝利した");
		}else {
			System.out.println("勇者たちは敗北した");
		}
		
	}

}
