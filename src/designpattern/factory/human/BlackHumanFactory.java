package designpattern.factory.human;

public class BlackHumanFactory implements HumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
