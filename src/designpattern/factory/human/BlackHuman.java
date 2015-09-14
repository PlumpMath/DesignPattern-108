package designpattern.factory.human;

class BlackHuman implements Human{

	@Override
	public String getColor() {
		return "黑色";
	}

	@Override
	public void talk() {
		System.out.println("我是黑色人种");
	}

}
