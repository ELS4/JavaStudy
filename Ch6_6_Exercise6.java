# JavaStudy
import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("가위(1), 바위(2), 보(3), 끝내기(4) >> ");
		
		String s[] = {"가위", "바위", "보"};
		int user = scanner.nextInt();
		int computer = (int)(Math.random()*3+1);
		
		System.out.println("사용자 "+s[user-1]+" : "+"컴퓨터 "+s[computer-1]);
		int res = computer - user;
		
		if (user == 4) {
			System.out.println("게임을 종료합니다...");
			break;
		}
		
		switch(res) {
			case -2:
			case 1:
				System.out.println("사용자가 졌습니다."); break;
			case -1: 
			case 2:
				System.out.println("사용자가 이겼습니다."); break;
			case 0: 
				System.out.println("비겼습니다."); break;
			default:
				System.out.println("숫자를 제대로 입력해주십시오."); break;
			}
		}
		scanner.close();
	}
}
