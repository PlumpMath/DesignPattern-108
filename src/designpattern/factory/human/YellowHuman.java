package designpattern.factory.human;

class YellowHuman implements Human{

	@Override
	public String getColor() {
		return "黄色";
	}

	@Override
	public void talk() {
		System.out.println("我是黄色人种");
	}

}
