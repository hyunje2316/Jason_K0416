package rsp;

import java.util.Scanner;

class RSPArray{
	String[] rsp = new String[3];
	
	public RSPArray() {
		rsp[0] = "가위";
		rsp[1] = "바위";
		rsp[2] = "보";
	}
	
	public String getRSP(int a) {
		return rsp[a];
	}
	
	public void getResult(int result) {
		switch(result) {
		case -1:
			System.out.println("유저가 패배했습니다.");
			break;		
		case 2:
			System.out.println("유저가 패배했습니다.");
			break;	
		case 0:
			System.out.println("비겼습니다.");
			break;	
		case 1:
			System.out.println("유저가 이겼습니다.");
			break;		
		case -2:
			System.out.println("유저가 이겼습니다.");
			break;		
		default:
			System.out.println("에러가 발생하였습니다.");			
		}
	}
}

public class RSP {
	public static void main(String args[]) {
		RSPArray arr = new RSPArray();
		Scanner scan = new Scanner(System.in);
		
		int choose, random, result, yesno;
		
		System.out.println("가위바위보를 실행합니다.");
		
		while(true) {
			System.out.print("가위(0), 바위(1), 보(2)에 해당하는 숫자를 입력하시오 : ");
			choose = scan.nextInt();		
			random = (int)(Math.random() * 3.0);
			result = choose - random;
			
			System.out.println("사용자 : " + arr.getRSP(choose) + " 컴퓨터 : " + arr.getRSP(random));
			arr.getResult(result);
			
			System.out.print("계속하시겠습니까? (yes = 1 / no = 0) ");
			yesno = scan.nextInt();
			
			if(yesno == 1)
				continue;
			else
				break;
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}