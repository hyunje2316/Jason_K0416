package quiz10_1;

import java.util.Scanner;

public class Theater {
	public static void main(String args[]) {
		int i, reserv;
		int[] seat = new int[10];
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�? (1 �Ǵ� 0) ");
			i = input.nextInt();
			if(i == 0)
				break;
			
			System.out.println("������ ���� ���´� ������ �����ϴ�.");
			System.out.println("--------------------------------------");
			
			for (int x = 1; x <= 10; x++) {
				System.out.print(x + " ");
			}
			System.out.println("\n--------------------------------------");
			
			for (int x = 0; x < 10; x++) {
				System.out.print(seat[x] + " ");
			}
			
			System.out.print("\n���° �¼��� �����Ͻðڽ��ϱ�? ");
			reserv = input.nextInt();
			seat[reserv-1] = 1;
			System.out.println("����Ǿ����ϴ�.");
		}
		
		System.out.println("���� ���� ���¸� ǥ���մϴ�.");
		for (int x = 1; x <=10; x++) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		for (int x = 0; x < seat.length; x++) {
			System.out.print(seat[x] + " ");
		}
		System.out.println("\n�¼� ���Ÿ� ���� �մϴ�.");
	}
}
