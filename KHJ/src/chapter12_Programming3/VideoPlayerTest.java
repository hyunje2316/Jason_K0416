package chapter12_Programming3;

interface Controllable{
	void play();
	void stop();
}

public class VideoPlayerTest {
	public static void main(String args[]) {
		Controllable ca = new Controllable() {
			public void play() {
				System.out.println("Play");
			}
			
			public void stop() {
				System.out.println("Stop");
			}
		};
	}
}
