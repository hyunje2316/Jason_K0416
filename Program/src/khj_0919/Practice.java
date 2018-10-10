package khj_0919;

import java.util.*;
import java.io.*;

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

public class Practice {
	public static void main(String args[]) throws IOException {
		RSPArray arr = new RSPArray();
		Random r = new Random();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int user, result, computer;
		String yesno;
		
		System.out.println("가위바위보를 실행합니다.");
		while(true) {
			System.out.print("가위, 바위, 보 중 하나를 선택하세요. (가위 = 0, 바위 = 1, 보 = 2) ");
			user = Integer.parseInt(in.readLine());
			computer = Math.abs(r.nextInt() % 3);
			result = user - computer;
			
			System.out.println("유저 : " + arr.getRSP(user) + " 컴퓨터 : " + arr.getRSP(computer));
			arr.getResult(result);
			
			System.out.print("계속하시겠습니까? (y/n)");
			yesno = in.readLine();
			
			if(yesno.equals("y"))
				continue;
			else
				break;
		}
		
		System.out.println("프로그램을 종료합니다. ");
	}
}
