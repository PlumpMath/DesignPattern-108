package designpattern.factory.human;

class WhiteHuman implements Human{

	@Override
	public String getColor() {
		return "��ɫ";
	}

	@Override
	public void talk() {
		System.out.println("���ǰ�ɫ����");
	}

}
