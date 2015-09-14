package designpattern.factory;

import designpattern.factory.human.Human;
import designpattern.factory.human.HumanFactory;

public class HumanTest {

	public static void main(String[] args) {
		String type = "WhiteHuman";
		Human human = HumanFactory.createHuman(type);

		human.getColor();
		human.talk();

//		Human whiteHuman = new WhiteHuman();
//		Human blackHuman = new BlackHuman();
//		Human yellowHuman = new YellowHuman();
	}

}
