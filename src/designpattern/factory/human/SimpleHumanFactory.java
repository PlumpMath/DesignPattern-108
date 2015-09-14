package designpattern.factory.human;

public class SimpleHumanFactory {

	public static Human createHuman(String type) {
		Human human;

		if (type.equals("WhiteHuman")) {
			human = new WhiteHuman();
		} else if (type.equals("BlackHuman")) {
			human = new BlackHuman();
		} else if (type.equals("YellowHuman")) {
			human = new YellowHuman();
		} else {
			human = null;
		}

		return human;
	}
}
