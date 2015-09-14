package designpattern.factory.human;

public class YellowHumanFactory implements HumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
