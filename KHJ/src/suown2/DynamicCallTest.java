package suown2;

class Television{
	int channel;
	int volume;
	boolean onOff;
	void print() {
		System.out.println("채널은 " + channel + "이고 볼퓸은 " + volume + "입니다.");
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
