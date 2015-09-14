package designpattern.factory.human;

class YellowHuman implements Human{

	@Override
	public String getColor() {
		return "��ɫ";
	}

	@Override
	public void talk() {
		System.out.println("���ǻ�ɫ����");
	}

}
