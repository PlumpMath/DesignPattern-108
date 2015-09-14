package designpattern.factory;

import designpattern.factory.human.Human;
import designpattern.factory.human.SimpleHumanFactory;
import designpattern.factory.human.WhiteHumanFactory;

public class FactoryTest {

	public static void main(String[] args) {
		String type = "WhiteHuman";
		Human human = SimpleHumanFactory.createHuman(type);

		human.getColor();
		human.talk();

//		Human whiteHuman = new WhiteHuman();
//		Human blackHuman = new BlackHuman();
//		Human yellowHuman = new YellowHuman();
		
		
		WhiteHumanFactory whiteHumanFactory = new WhiteHumanFactory();
		Human whiteHuman1 = whiteHumanFactory.createHuman();
		Human whiteHuman2 = whiteHumanFactory.createHuman();
		Human whiteHuman3 = whiteHumanFactory.createHuman();

		whiteHuman1.talk();
		whiteHuman2.talk();
		whiteHuman3.talk();

	}

}
