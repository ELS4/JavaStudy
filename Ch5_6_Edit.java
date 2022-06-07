# JavaStudy
import java.util.Scanner;

class Func {
	Scanner scanner = new Scanner(System.in);
	String[] shape=new String[10];
	int response;
	int size=0;
	
	public void insert() {
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>> ");
		response = scanner.nextInt();
		switch(response) {
		case 1:
			shape[size]="Line";
			size++;
			break;
		case 2: 
			shape[size]="Rect";
			size++;
			break;
		case 3:
			shape[size]="Circle";
			size++;
			break;
		}
	}
	
	public void delete() {
		System.out.println("삭제할 도형의 위치>> ");
		response=scanner.nextInt();
		if (response < 0 || response > size) {
			System.out.println("삭제할 수 없습니다.");
		}
		else shape[response]=null;
	}
	
	public void show() {
		for (int i=0; i<size; i++) {
			if(shape[i] != null) System.out.println(shape[i]);
			else break;
		}
	}
}

public class Edit extends Func{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int response;
		Edit e = new Edit();
		boolean flag = true;
		while (flag) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
		response = scanner.nextInt();
		switch(response) {
		case 1: 
			e.insert();
			break;
		case 2:
			e.delete();
			break;
		case 3:
			e.show();
			break;
		case 4: 
			System.out.println("프로그램을 종료합니다...");
			flag = false;
			break;
				}
			}
		}
	}
