package java20180518;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> arr = new ArrayList<>();
		boolean btn = true;
		
		System.out.print("<<Soja Club>>");
		
		while(btn) {
			System.out.print("[1]가입 [2]수정 [3]목록 [4]종료 >>");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("==회원가입==");
				System.out.print("이름 : ");
				String input_name = sc.next();
				System.out.print("주량 : ");
				int input_soju = sc.nextInt();
				System.out.println(input_name+"님이 추가되었습니다.");
				System.out.println();
				
				Person pr = new Person(input_name, input_soju);
				arr.add(pr);
				break;
			case 2:
				
				break;
			case 3:
				break;
			case 4 :
				btn = false;
				break;

			default:
				break;
			}
		}
		


	}

}
