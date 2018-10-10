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
		
		System.out.println("구구단 게임을 시작합니다. 종료를 원하시면 -1를 입력하세요.");
		
		while(true) {
			q.Random();
			answer = input.nextInt();
			
			if(answer == -1)
				break;
			
			if(q.Correct(answer) == true) {
				System.out.println("정답입니다.");
			}
			else if(q.Correct(answer) == false) {
				System.out.println("오답입니다. 정답은 " + q.AnswerIs() + "입니다.");
			}
			else
				System.out.println("오류가 발생했습니다.");	
		}	
		
		System.out.println("프로그램을 종료합니다.");
	}
}
