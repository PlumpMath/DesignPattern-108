package designpattern.factory.human;

class BlackHuman implements Human{

	@Override
	public String getColor() {
		return "��ɫ";
	}

	@Override
	public void talk() {
		System.out.println("���Ǻ�ɫ����");
	}

}
