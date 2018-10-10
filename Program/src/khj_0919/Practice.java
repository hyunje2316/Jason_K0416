package khj_0919;

import java.util.*;
import java.io.*;

class RSPArray{
	String[] rsp = new String[3];
	
	public RSPArray() {
		rsp[0] = "����";
		rsp[1] = "����";
		rsp[2] = "��";
	}
	
	public String getRSP(int a) {
		return rsp[a];
	}
	
	public void getResult(int result) {
		switch(result) {
		case -1:
			System.out.println("������ �й��߽��ϴ�.");
			break;		
		case 2:
			System.out.println("������ �й��߽��ϴ�.");
			break;	
		case 0:
			System.out.println("�����ϴ�.");
			break;	
		case 1:
			System.out.println("������ �̰���ϴ�.");
			break;		
		case -2:
			System.out.println("������ �̰���ϴ�.");
			break;		
		default:
			System.out.println("������ �߻��Ͽ����ϴ�.");			
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
		
		System.out.println("������������ �����մϴ�.");
		while(true) {
			System.out.print("����, ����, �� �� �ϳ��� �����ϼ���. (���� = 0, ���� = 1, �� = 2) ");
			user = Integer.parseInt(in.readLine());
			computer = Math.abs(r.nextInt() % 3);
			result = user - computer;
			
			System.out.println("���� : " + arr.getRSP(user) + " ��ǻ�� : " + arr.getRSP(computer));
			arr.getResult(result);
			
			System.out.print("����Ͻðڽ��ϱ�? (y/n)");
			yesno = in.readLine();
			
			if(yesno.equals("y"))
				continue;
			else
				break;
		}
		
		System.out.println("���α׷��� �����մϴ�. ");
	}
}
