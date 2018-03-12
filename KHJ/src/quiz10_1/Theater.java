package quiz10_1;

import java.util.Scanner;

public class Theater {
	public static void main(String args[]) {
		int i, reserv;
		int[] seat = new int[10];
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("좌석을 예약하시겠습니까? (1 또는 0) ");
			i = input.nextInt();
			if(i == 0)
				break;
			
			System.out.println("현재의 예약 상태는 다음과 같습니다.");
			System.out.println("--------------------------------------");
			
			for (int x = 1; x <= 10; x++) {
				System.out.print(x + " ");
			}
			System.out.println("\n--------------------------------------");
			
			for (int x = 0; x < 10; x++) {
				System.out.print(seat[x] + " ");
			}
			
			System.out.print("\n몇번째 좌석을 예약하시겠습니까? ");
			reserv = input.nextInt();
			seat[reserv-1] = 1;
			System.out.println("예약되었습니다.");
		}
		
		System.out.println("현재 예약 상태를 표시합니다.");
		for (int x = 1; x <=10; x++) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		for (int x = 0; x < seat.length; x++) {
			System.out.print(seat[x] + " ");
		}
		System.out.println("\n좌석 예매를 종료 합니다.");
	}
}
