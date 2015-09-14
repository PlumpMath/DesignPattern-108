package designpattern.factory.human;

class WhiteHuman implements Human{

	@Override
	public String getColor() {
		return "白色";
	}

	@Override
	public void talk() {
		System.out.println("我是白色人种");
	}

}
