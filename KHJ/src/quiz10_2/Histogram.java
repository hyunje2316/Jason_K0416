package quiz10_2;

import java.util.Scanner;

public class Histogram {
	public static void main(String args[]) {
		int i, number;
		int[] count = new int[10];
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 : ");
			number = input.nextInt();
			if (number == -1)
				break;
			if (number < 0 && number > 100)
				continue;
			
			switch(number/10) {
			case 0: count[0]++; break;
			case 1: count[1]++; break;
			case 2: count[2]++; break;
			case 3: count[3]++; break;
			case 4: count[4]++; break;
			case 5: count[5]++; break;
			case 6: count[6]++; break;
			case 7: count[7]++; break;
			case 8: count[8]++; break;
			case 9: count[9]++; break;
			case 10: count[9]++; break;
			}
		}
		
		for(i = 0; i < count.length; i++) {
			System.out.print("\n" + i * 10 + " - " + ((i * 10) + 9) + " : ");
			for(int x = 1; x <= count[i]; x++) {
				System.out.print("*");
			}
		}
	}
}
