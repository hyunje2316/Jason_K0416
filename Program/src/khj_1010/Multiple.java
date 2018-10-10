package khj_1010;

import java.util.*;

class Question{
	int num1, num2, multinum;
	
	public void Random() {
		num1 = (int)(1 + Math.random() * 9.0);
		num2 = (int)(1 + Math.random() * 9.0);
		multinum = num1 * num2;
		
		System.out.print(num1 + " * " + num2 + " = ");
	}
	
	public boolean Correct(int a) {
		if((multinum) == a) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int AnswerIs() {
		return multinum;
	}
}

public class Multiple {
	public static void main(String args[]) {
		Question q = new Question();
		Scanner input = new Scanner(System.in);
		int answer;
		
		System.out.println("������ ������ �����մϴ�. ���Ḧ ���Ͻø� -1�� �Է��ϼ���.");
		
		while(true) {
			q.Random();
			answer = input.nextInt();
			
			if(answer == -1)
				break;
			
			if(q.Correct(answer) == true) {
				System.out.println("�����Դϴ�.");
			}
			else if(q.Correct(answer) == false) {
				System.out.println("�����Դϴ�. ������ " + q.AnswerIs() + "�Դϴ�.");
			}
			else
				System.out.println("������ �߻��߽��ϴ�.");	
		}	
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}
