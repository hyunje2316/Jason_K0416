package suown2;

class Television{
	int channel;
	int volume;
	boolean onOff;
	void print() {
		System.out.println("ä���� " + channel + "�̰� ��Ǿ�� " + volume + "�Դϴ�.");
	}
}

public class DynamicCallTest {
	public static void main(String args[]) {
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		myTv.print();
	}
}
