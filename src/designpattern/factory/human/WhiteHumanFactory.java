package designpattern.factory.human;

public class WhiteHumanFactory implements HumanFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
