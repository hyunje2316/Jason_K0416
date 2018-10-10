package rsp;

import java.util.Scanner;

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

public class RSP {
	public static void main(String args[]) {
		RSPArray arr = new RSPArray();
		Scanner scan = new Scanner(System.in);
		
		int choose, random, result, yesno;
		
		System.out.println("������������ �����մϴ�.");
		
		while(true) {
			System.out.print("����(0), ����(1), ��(2)�� �ش��ϴ� ���ڸ� �Է��Ͻÿ� : ");
			choose = scan.nextInt();		
			random = (int)(Math.random() * 3.0);
			result = choose - random;
			
			System.out.println("����� : " + arr.getRSP(choose) + " ��ǻ�� : " + arr.getRSP(random));
			arr.getResult(result);
			
			System.out.print("����Ͻðڽ��ϱ�? (yes = 1 / no = 0) ");
			yesno = scan.nextInt();
			
			if(yesno == 1)
				continue;
			else
				break;
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}