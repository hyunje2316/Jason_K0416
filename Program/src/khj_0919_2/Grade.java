package khj_0919_2;

import java.io.*;

class Calculator{
	
	public void Calgrade(int a) {
		a = a / 10;
		if (a <= 10 && a >= 0) {
			switch(a) {
			case 10:
			case 9:
				System.out.println("��� : A");
				break;	
				
			case 8:
				System.out.println("��� : B");
				break;
				
			case 7:	
				System.out.println("��� : C");
				break;	
				
			case 6:				
				System.out.println("��� : D");
				break;
				
			default:
				System.out.println("��� : F");
				break;
			}
		}
	}
}

public class Grade {
	public static void main(String args[]) throws IOException{
		Calculator cal = new Calculator();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int score;
		
		System.out.print("������ �Է��Ͻÿ� : ");
		score = Integer.parseInt(in.readLine());
		
		cal.Calgrade(score);
	}
}
